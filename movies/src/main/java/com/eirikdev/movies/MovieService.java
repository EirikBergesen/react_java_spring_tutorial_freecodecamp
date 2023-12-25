package com.eirikdev.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Movie> singleMovie(String imdbId) {
        // Optional will remove null if the object id does not exist
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
