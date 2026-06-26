** Capstone-_API-Clothing-Store **
****Clothing Store API****
=============================================================================================================
## Overview
=============================================================================================================
The Clothing Store API is a RESTful backend application built with Java and Spring Boot that powers an online
clothing store. It provides secure authentication, product and category management, shopping cart functionality, 
user profile management, and a complete checkout workflow. The project follows a layered architecture using Controllers,
Services, Repositories, and JPA entities to ensure clean separation of responsibilities and maintainability.

=============================================================================================================
## Technologies Used
=============================================================================================================
Java 17
Spring Boot
Spring Security
Spring Data JPA
Hibernate
MySQL
Maven
JWT Authentication
REST APIs
JUnit
Mockito
H2 Database (Testing)

=========================================================================================================
### Features
=========================================================================================================
**Authentication**

User registration
Secure login using JWT
Password encryption with BCrypt
Role-based authorization
Protected API endpoints

**Product Management**

Retrieve all products
Search and filter products
Filter by:
Category
Subcategory
Minimum price
Maximum price
Featured products
Product details lookup
Product inventory management

**Category Management**

Retrieve all categories
Retrieve a category by ID
Create categories (Admin)
Update categories (Admin)
Delete categories (Admin)
Retrieve all products within a category

=======================================================================================================
### Shopping Cart
=======================================================================================================
Implemented a complete shopping cart system.

Users can:

View their shopping cart
Add products to the cart
Update product quantities
Remove all items from the cart

Shopping carts are stored in the database and remain available after users log back in.

=======================================================================================================
### User Profile
=======================================================================================================
Implemented profile management.

Users can:

View their profile
Update:
First name
Last name
Phone number
Email
Address
City
State
ZIP Code

Profiles are automatically created when a new user registers.

===========================================================================================================
### Checkout
===========================================================================================================
Implemented a complete checkout workflow.

When a customer places an order:

Retrieves the current shopping cart
Creates a new order
Creates one order line item for each product
Copies shipping information from the user's profile
Stores the order in the database
Clears the shopping cart after a successful checkout

=================================================================================================

### Bug Fixes

**Bug #1**

Resolved an issue where product searches returned incomplete results.

Solution
Corrected filtering logic
Ensured all matching products are returned
Added unit tests to verify expected behavior

================================================================================================

**Bug #2**

Resolved an issue where product stock updates were not properly persisted.

Solution
Corrected inventory update logic
Verified stock updates through API testing
Added unit tests

===================================================================================================
### Testing
====================================================================================================
The application was thoroughly tested using:

JUnit 5
Mockito
Insomnia

Completed testing includes:

Product endpoints
Category endpoints
Shopping cart endpoints
Profile endpoints
Checkout workflow
Authentication and authorization
Bug regression tests

All provided backend tests pass successfully.

=================================================================================================
### API Endpoints
=================================================================================================

**Authentication**

Method	Endpoint
POST	/login
POST	/register

**Products**

Method	Endpoint
GET	/products
GET	/products/{id}

**Categories**

Method	Endpoint
GET	/categories
GET	/categories/{id}
GET	/categories/{id}/products
POST	/categories
PUT	/categories/{id}
DELETE	/categories/{id}

**Shopping Cart**
Method	Endpoint
GET	/cart
POST	/cart/products/{id}
PUT	/cart/products/{id}
DELETE	/cart

**Profile**
Method	Endpoint
GET	/profile
PUT	/profile

**Orders**

Method	Endpoint
POST	/orders
==========================================================================================================
### Project Architecture
==========================================================================================================
The application follows a layered architecture:

Controllers
Services
Repositories
Models (Entities)
DTOs
Security Configuration

This structure improves scalability, readability, and maintainability.

==========================================================================================================
### Future Enhancements
==========================================================================================================
The frontend is currently being expanded with additional features, including:

Modern responsive user interface
Checkout page
Order history
Loyalty rewards program
Premium shipping options
Improved product cards
Enhanced shopping experience

=========================================================================================================
### Author
=========================================================================================================
Developed as a full-stack capstone project using Spring Boot, MySQL, REST APIs, JWT authentication, 
and modern Java development practices.