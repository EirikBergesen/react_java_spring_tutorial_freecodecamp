package com.eirikdev.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    // Autowired tells the framework that we want it to instantiate the class for us.
    // So we do not have to initialize the class ourselves.
    // Reference to the movieRepository repository
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        // This findAll method is defined in the MongoRepository class
        return movieRepository.findAll();
    }
}
