package com.eirikdev.movies;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// First api controller written in this api
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public String allMovies() {
        return "All Movies!";
    }
}
