package dev.ying.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // findById() is a default function, it will return a unique movie object, otherwise will return error.
    // findAll() is a default function.
    Optional<Movie> findMovieByImdbId(String imdbId);
}
