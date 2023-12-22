# Full stack development course

Following alongside free course by freecodecamp.org

Full Stack Development with Java Spring Boot, React, and MongoDB - Full Course

https://www.youtube.com/watch?v=5PdEmeopJVQ - 21/12-2023


## Mongo DB initialization

Mongo db atlas

Create a new organization: eirikorg

Create a new project: moviesapi

Create a new cluster: cluster0

Create a new user: eirikuser and password - put in password manager

Download mongoDB compass

Connect to cluster0 - Copy connection string from browser and add password

Create new Database: movie-api-db

Create new collection: movies

Import data from movies.json, from tutorial


## Spring boot initialization
https://start.spring.io/

Spring boot stable release - 3.2.1 
Maven Project - Java 21 language

Dependencies:
* Lombok
* Spring Web
* Spring Data MongoDB
* Spring Boot DevTools

Jar - packaging


### Try running application
Should return whitelabel error page

This is good, as it means it works, but nothing is implemented yet


## Configuring the database
In project find
* src/main/resources/application.properties

Add the following:
```
spring.data.mongodb.database=databasename

spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster>.<database>
```