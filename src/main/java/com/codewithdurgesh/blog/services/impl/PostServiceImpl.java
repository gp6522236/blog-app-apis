package com.codewithdurgesh.blog.services.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.codewithdurgesh.blog.entities.Category;
import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.entities.User;
import com.codewithdurgesh.blog.exceptions.ResourceNotFoundException;
import com.codewithdurgesh.blog.payloads.PostDto;
import com.codewithdurgesh.blog.repository.CategoryRepo;
import com.codewithdurgesh.blog.repository.PostRepo;
import com.codewithdurgesh.blog.repository.UserRepo;
import com.codewithdurgesh.blog.services.PostService;
import org.springframework.data.domain.Pageable;


@Service
public class PostServiceImpl implements PostService {
    @Autowired
	private PostRepo postRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CategoryRepo categoryRepo;
	@Override
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User ", "User id", userId));
		
		Category category=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","category id",categoryId));
		
		Post post=this.modelMapper.map(postDto,Post.class);
		post.setImageName("Default-img.png");
		post.setAddDate(new Date());
		post.setCategory(category);
		post.setUser(user);
		
		Post newPost =this.postRepo.save(post);
		return this.modelMapper.map(newPost, PostDto.class);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		Post post=this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","Post id",postId));
		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setImageName(postDto.getImageName());
		post.setAddDate(postDto.getAddDate());
		Post updatedPost=this.postRepo.save(post);
           

		return this.modelMapper.map(updatedPost, PostDto.class);
	}

	@Override
	public void deletePost(Integer postId) {
     Post post=this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","Post id",postId));
    this.postRepo.delete(post);
		
	}

	@Override
	public List<PostDto> getAllPost(Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
//		we are taking dynamick
//		 int pageSize=5;
//		 int pageNumber=1;
		 
		 Pageable p=PageRequest.of(pageNumber, pageSize);
		 
		 Page<Post> pagePost=this.postRepo.findAll(p);
		 List<Post>allPosts=pagePost.getContent();
		
		List<PostDto>postDtos=allPosts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
		return postDtos;	}

	@Override
	public PostDto getPostById(Integer postId) {
		// TODO Auto-generated method stub
		Post post=this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","Post id",postId));
		return this.modelMapper.map(post,PostDto.class);
	}

	@Override
	public List<PostDto> getPostByCategory(Integer categroyId) {
		// TODO Auto-generated method stub
		Category cat=this.categoryRepo.findById(categroyId).orElseThrow(()->new ResourceNotFoundException("Category","category id",categroyId));
		List<Post>posts=this.postRepo.findByCategory(cat);
		
		List<PostDto>postDtos=posts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
		return postDtos;
	}

	@Override
	public List<PostDto> getPostsByUser(Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","userId",userId));
		List<Post>posts=this.postRepo.findByUser(user);
		List<PostDto>postDtos=posts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());

		return postDtos;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
