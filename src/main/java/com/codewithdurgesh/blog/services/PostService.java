package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;
import com.codewithdurgesh.blog.payloads.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	 PostDto updatePost(PostDto postDto, Integer postId);
	 
	 //delete
	 void deletePost(Integer postId);
	 
	 //get all posts 
	 PostResponse getAllPost(Integer pageNumber,Integer pageSize, String sortBy,String sortDir );
	 
	 //get single post
	 PostDto getPostById(Integer postid);
	 
	 //get all post by category
    List<PostDto>getPostByCategory(Integer categroy);
    
    //by user
    List<PostDto>getPostsByUser(Integer userId);
    
    //search
    List<PostDto>searchPosts(String keyword);

}
