# Blog App REST APIs

A Spring Boot REST API project for managing a blogging platform. The application provides APIs for managing users, categories, and blog posts with proper validation, exception handling, and database integration.

## Features

### User Management

* Create User
* Update User
* Delete User
* Get User by ID
* Get All Users

### Category Management

* Create Category
* Update Category
* Delete Category
* Get Category by ID
* Get All Categories

### Post Management

* Create Post
* Update Post
* Delete Post
* Get Post by ID
* Get All Posts

### Additional Features

* DTO Mapping using ModelMapper
* Global Exception Handling
* Input Validation
* RESTful API Design
* MySQL Database Integration
* Spring Data JPA

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* ModelMapper

## Project Structure

* Controller Layer
* Service Layer
* Repository Layer
* Entity Layer
* DTO Layer
* Exception Handling Layer

## Run Locally

```bash
git clone https://github.com/gp6522236/blog-app-apis.git

cd blog-app-apis

mvn spring-boot:run
```

## Database

Configure database credentials in:

```properties
application.properties
```

## Future Enhancements

* User Authentication & Authorization (Spring Security + JWT)
* Pagination & Sorting
* Search APIs
* Image Upload Support
* API Documentation using Swagger/OpenAPI

```
```
