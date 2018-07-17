
package com.stackroute.movieapp.controllerstest;
import com.stackroute.movieapp.controllers.MovieController;
import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.services.MovieService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebMvcTest(MovieController.class)
public class MovieControllerTest {
    @Autowired
    private MockMvc movieMockMvc;
    @MockBean
	private MovieService movieService;
	/*@InjectMocks
	private MovieController movieController = new MovieController(movieService);*/
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getAllMovies() throws Exception{
        when(movieService.getAllMovies()).thenReturn(null);
        movieMockMvc.perform(get("/api/v1/movies"))
				.andExpect(status().isOk());
    }
}