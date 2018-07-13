package com.stackroute.movieapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	
	private MovieRepository movieRepository;

	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
		
	}
	
	@Override
	public Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Optional<Movie> getMovieById(int id) {
		return movieRepository.findById(id);
	}

	@Override
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);;
	}

	@Override
	public Movie updateMovie(Movie movie, int id) {
		movie.setId(id);
		return movieRepository.save(movie);
	}
	
	
}
