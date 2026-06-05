package com.codewithdurgesh.blog.payloads;

import java.util.Date;

import com.codewithdurgesh.blog.entities.Category;
import com.codewithdurgesh.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	

	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addDate;
	
   
	private UserDto user;

	private CategoryDto category;


//	public void setImageName(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	public void setAddDate(Date date) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	public void setCategory(Category category) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	public void setUser(User user2) {
//		// TODO Auto-generated method stub
//		
//	}
	


}
