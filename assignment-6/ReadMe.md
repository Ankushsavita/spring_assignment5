# User Management System Application

# Requirements

* Framework - Springboot 3.0.5 version
* Language - Java 17 version
* Build tool - Maven

# Dependencies

* Spring web
* Springboot dev tools
* lombok developer tool

# EndPoints

* http://localhost:8080/api/v1/app/addUser


* http://localhost:8080/api/v1/app/getAllUser


* http://localhost:8080/api/v1/app/getUser/userId/1


* http://localhost:8080/api/v1/app/updateUser/userId/2


* http://localhost:8080/api/v1/app/deleteUser/userId/1


# Data Flow

* Controller : This component handles incoming requests and returns responses to the client. It receives requests from the client, invokes the appropriate method on the service layer, and returns the response to the client.


* Service : This component contains the business logic for the application. It receives requests from the controller layer and interacts with the repository layer to perform CRUD (create, read, update, delete) operations on the data.


* DataBase : This is ArrayList Database. This is where the user data is stored. The repository layer interacts directly with the database to perform CRUD operations on the data.

# Project Summary

* I have created User Management System using Springboot Application. so here, When a user sends a request to the system, it is received by the Controller layer. The Controller layer then invokes the appropriate method on the Service layer, passing along any necessary parameters from the request. The Service layer then invokes the appropriate method on the Repository layer to perform the requested operation.