package com.platzi.platzi.play.persistence;

import com.platzi.platzi.play.domain.dto.MovieDto;
import com.platzi.platzi.play.domain.repository.MovieRepository;
import com.platzi.platzi.play.persistence.crud.CrudMovieEntity;
import com.platzi.platzi.play.persistence.entity.MovieEntity;
import com.platzi.platzi.play.persistence.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll(){
        return this.movieMapper.toDo(this.crudMovieEntity.findAll());
    }

    @Override
    public MovieDto getById(long id) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
        return this.movieMapper.toDto(movieEntity);
    }
}
