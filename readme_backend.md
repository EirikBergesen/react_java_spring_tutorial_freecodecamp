
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


### Configuring the database

In project find
* src/main/resources/application.properties

Add the following:

spring.data.mongodb.database=databasename

spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster>.<database>


### Installing new dependencies

https://mvnrepository.com/

Search for dependency, and copy the dependency code

https://mvnrepository.com/artifact/me.paulschwarz/spring-dotenv

copy paste into pom.xml, into dependencies

### Creating a class - Movie

Create new file Movie

Add annotations and fields/variables to class that match our database fields

* @Document - Spring annotation to tell spring that this is a document to be stored in the database
* @Data - Lombok annotation to generate getters and setters and tostrings
* @AllArgsConstructor - Lombok annotation to generate constructor with all fields
* @NoArgsConstructor - Lombok annotation to generate constructor with no fields

@Id - Spring annotation to tell spring that this is the id field

#### .env file

https://stackoverflow.com/questions/76938433/spring-boot-mongo-db-bean-error-for-srv-host-name
Learned that ${env.prop} is deprecated, and that we should use ${prop} instead


### Creating a class - Review

Annotations:

fields/variables:
ObjectId id
String body

* @Document - Spring annotation to tell spring that this is a document to be stored in the database
* @Data - Lombok annotation to generate getters and setters and tostrings
* @AllArgsConstructor - Lombok annotation to generate constructor with all fields
* @NoArgsConstructor - Lombok annotation to generate constructor with no fields
* @Id - Spring annotation to tell spring that this is the id field

An instance of a review. A review is a document in the database, and has an id and a body.


### Creating a repository interface - MovieRepository

Annotations:
* @Repository - Spring annotation to tell spring that this is a repository interface

extends MongoRepository<Movie, String>
contains methods for interacting with the database
* insert
* 


### Creating a controller(?) class - MovieController

Annotations:
* @RestController - Spring annotation to tell spring that this is a controller class
* @RequestMapping - Spring annotation to tell spring that this is the root path for this controller

fields/variables:


### Creating REST APIs

In REST APIs there are usually multiple layers.
One of the layers is the API layer. (MovieController class).
Getting a request from the user and returning a response.
Using a service class its delegating the tasks of retrieving data from the database and returning it to the user.
Gets the list of the movies and returns with an http status.


Business logic layer - Service class
Talks to the database and returns the data to the API layer.



### Creating a review

Post with postman
address localhost:8080/api/v1/reviews

choose body -> raw -> JSON

```
{
    "reviewBody": "I really liked this movie",
    "imdbId": "tt3915174"
}
```

if return status is 201 created, then it worked
and will be found at
http://localhost:8080/api/v1/movies/tt3915174

