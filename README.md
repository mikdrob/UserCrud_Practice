# Simple Spring Boot Rest API

## Description
The API uses local postrgeSQL database.<br>
Tests use in-memory H2 database.<br>
Only one entity - User (username, first name, last name, email).

## Setup on localhost
Start the database server (PostgreSQL)
Build the cloned project

Run the command:

    java -jar demo-0.0.1-SNAPSHOT.jar

Get all request:

    localhost:8080/api/v1/users

Search by username:

    localhost:8080/api/v1/users?username=test
    
Search by full name:

    localhost:8080/api/v1/users/name?firstName=test&lastName=test
     
## Additional Improvements
* Criteria Api
* DataJpaTest
* Mock tests