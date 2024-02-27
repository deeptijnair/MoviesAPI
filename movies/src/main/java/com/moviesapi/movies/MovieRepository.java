package com.moviesapi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movies, ObjectId> {

    //find movie by IMDB id
    Optional<Movies> findMovieByImdbId (String imdbId);
}
