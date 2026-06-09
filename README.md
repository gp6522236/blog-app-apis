# Blog App REST APIs

A Spring Boot REST API project for managing a blogging platform. The application provides APIs for managing users, categories, and blog posts with validation, exception handling, pagination, and MySQL database integration.

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
* Get Posts by User
* Get Posts by Category

### Additional Features

* DTO Mapping using ModelMapper
* Global Exception Handling
* Input Validation using Jakarta Validation
* RESTful API Design
* MySQL Database Integration
* Spring Data JPA
* Pagination Support

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

## API Examples

### Get All Posts with Pagination

```http
GET /api/posts?pageNumber=0&pageSize=5
```

### Get Posts by User

```http
GET /api/user/{userId}/posts
```

### Get Posts by Category

```http
GET /api/category/{categoryId}/posts
```

### Create Post

```http
POST /api/user/{userId}/category/{categoryId}/posts
```

## Run Locally

```bash
git clone https://github.com/gp6522236/blog-app-apis.git

cd blog-app-apis

mvn spring-boot:run
```

## Database Configuration

Configure your MySQL credentials in:

```properties
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blog_app_apis
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Future Enhancements

* User Authentication & Authorization (Spring Security + JWT)
* Sorting Support
* Search APIs
* Image Upload Support
* API Documentation using Swagger/OpenAPI
* Role-Based Access Control (RBAC)

## Author

Gaurav Patel

GitHub: https://github.com/gp6522236
