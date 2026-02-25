package com.platzi.platzi.play.web.controller;

import com.platzi.platzi.play.domain.dto.MovieDto;
import com.platzi.platzi.play.domain.services.MovieService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieDto> getAll(){
        return this.movieService.getAll();
    }

    @GetMapping("/{id}")
    public MovieDto getById(@PathVariable long id){
        return null;
    }
}
