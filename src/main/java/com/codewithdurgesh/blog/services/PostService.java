package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	 PostDto updatePost(PostDto postDto, Integer postId);
	 
	 //delete
	 void deletePost(Integer postId);
	 
	 //get all posts 
	 List<PostDto> getAllPost(Integer pageNumber,Integer pageSize );
	 
	 //get single post
	 PostDto getPostById(Integer postid);
	 
	 //get all post by category
    List<PostDto>getPostByCategory(Integer categroy);
    
    //by user
    List<PostDto>getPostsByUser(Integer userId);
    
    //search
    List<Post>searchPosts(String keyword);

}
