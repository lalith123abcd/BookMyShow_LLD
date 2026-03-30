package com.example.BookMyShowLLD.services;

import com.example.BookMyShowLLD.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

    public List<Movie> findAllMovies();

    public Optional<Movie> findMovieById(long id);

}