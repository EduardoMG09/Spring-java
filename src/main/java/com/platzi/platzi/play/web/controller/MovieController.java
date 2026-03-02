package com.platzi.platzi.play.web.controller;

import com.platzi.platzi.play.domain.dto.MovieDto;
import com.platzi.platzi.play.domain.services.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll(){
        return ResponseEntity.ok(this.movieService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(@PathVariable long id){
        MovieDto moviedto = this.movieService.getById(id);

        if(moviedto == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(moviedto);
    }


    @PostMapping
    public ResponseEntity<MovieDto> add(@RequestBody MovieDto movieDto){

    }
}
