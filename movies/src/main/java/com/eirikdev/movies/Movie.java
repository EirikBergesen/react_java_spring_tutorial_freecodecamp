package com.eirikdev.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    // Without this annotation, this would be an embedded relationship.
    // All related reviews would be added to this list, and that would be fine.
    // This allows for a one movie to many reviews relationship

    // Manual reference relationship
    // This will cause the database to store only the IDs of the review.
    // and the reviews will be in a separate collection
    // Should probably read about how one can use mongoDB and spring for other db relationships.
    @DocumentReference
    private List<Review> reviewIds;

}
