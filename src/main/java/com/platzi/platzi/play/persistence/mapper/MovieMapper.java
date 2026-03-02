package com.platzi.platzi.play.persistence.mapper;

import com.platzi.platzi.play.domain.dto.MovieDto;
import com.platzi.platzi.play.persistence.entity.MovieEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.util.List;

@Mapper(componentModel = "spring", uses ={GenreMapper.class, EstadoMapper.class})
public interface MovieMapper {

    @Mapping(source="titulo", target="title")
    @Mapping(source="duracion", target="duration")
    @Mapping(source="genero",  target="genre", qualifiedByName = "stringToGener")
    @Mapping(source="clasificacion", target = "rating")
    @Mapping(source="estado", target="status", qualifiedByName = "stringToEstado")
    @Mapping(source="fechaEstreno", target="releaseDate")
    MovieDto toDto(MovieEntity entity);
    List<MovieDto> toDo(Iterable<MovieEntity> entities);

    @InheritInverseConfiguration
    @Mapping(source = "genre", target="genero", qualifiedByName = "generToString")
    @Mapping(source = "status", target="estado", qualifiedByName = "estadoToString")
    MovieEntity toEntity(MovieDto movieDto);
}
