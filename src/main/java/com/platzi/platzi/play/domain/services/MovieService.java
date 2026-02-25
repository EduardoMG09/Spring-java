package com.platzi.platzi.play.domain.services;

import com.platzi.platzi.play.domain.dto.MovieDto;
import com.platzi.platzi.play.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAll(){
        return this.movieRepository.getAll();
    }
}
