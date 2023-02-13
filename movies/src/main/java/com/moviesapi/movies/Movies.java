package com.moviesapi.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//This annotation marks a class as being a domain object that we want to persist to the database.
// It also allows us to choose the name of the collection we want to use
//Note, that this annotation is the Mongo equivalent of @Entity in JPA.
@Document(collection = "movies")
//Takes care of getters,setters ,toString methods, constructors
@Data
//Annotation for constructor that takes all the private fields below as arguments
@AllArgsConstructor
//Constructor that does not take any arguments
@NoArgsConstructor
public class Movies {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewsId;

}
