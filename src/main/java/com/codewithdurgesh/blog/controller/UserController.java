package com.codewithdurgesh.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.codewithdurgesh.blog.payloads.ApiResponse;
import com.codewithdurgesh.blog.payloads.UserDto;
import com.codewithdurgesh.blog.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create User
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(
            @Valid @RequestBody UserDto userDto) {

        UserDto createUserDto = this.userService.createUser(userDto);

        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }

    // Update User
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(
            @Valid @RequestBody UserDto userDto,
            @PathVariable("userId") Integer uid) {

        UserDto updatedUser = this.userService.updateUser(userDto, uid);

        return ResponseEntity.ok(updatedUser);
    }

    // Delete User
    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(
            @PathVariable("userId") Integer uid) {

        this.userService.deleteUser(uid);

        return ResponseEntity.ok(
                new ApiResponse("User Deleted Successfully", true));
    }

    // Get All Users
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers() {

        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    // Get Single User
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(
            @PathVariable Integer userId) {

        return ResponseEntity.ok(
                this.userService.getUserById(userId));
    }
}