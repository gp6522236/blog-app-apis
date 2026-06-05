package com.codewithdurgesh.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	@NotNull
	private int id;
	@NotBlank
	@Size(min=4,message="User must be min 5 character")
	private String name;
	@Email(message="Email address is not correct")
	@NotBlank
	private String email;
	@NotBlank
	@Size(min=3,max=10,message="Passoword must be min   of 3 and max is 10")
	private String password;
	@NotBlank
	private String about;

}
