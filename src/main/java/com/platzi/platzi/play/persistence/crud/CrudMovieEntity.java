package com.platzi.platzi.play.persistence.crud;

import com.platzi.platzi.play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
    
}
