package com.platzi.platzi.play.domain.repository;

import com.platzi.platzi.play.domain.dto.MovieDto;
import com.platzi.platzi.play.web.controller.MovieController;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
    MovieDto getById(long id);
    MovieDto save(MovieDto movieDto);
}
