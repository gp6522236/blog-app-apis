package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	 Post updatePost(PostDto postDto, Integer postId);
	 
	 //delete
	 void deletePost(Integer postId);
	 
	 //get all posts 
	 List<Post> getAllPost();
	 
	 //get single post
	 Post getPostById(Integer postid);
	 
	 //get all post by category
    List<Post>getPostByCategory(Integer categroy);
    
    //by user
    List<Post>getPostsByUser(Integer userId);
    
    //search
    List<Post>searchPosts(String keyword);

}
