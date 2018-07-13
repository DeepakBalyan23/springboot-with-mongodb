package com.stackroute.movieapp.services;

import java.util.Optional;

import com.stackroute.movieapp.domain.Movie;

public interface MovieService {

	public Movie saveMovie(Movie movie);
	
	public Iterable<Movie> getAllMovies();
	
	public Optional<Movie> getMovieById(int id);
	
	public void deleteMovie(int id);
	
	Movie updateMovie(Movie movie, int id);
}
