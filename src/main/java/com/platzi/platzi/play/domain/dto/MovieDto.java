package com.platzi.platzi.play.domain.dto;

import com.platzi.platzi.play.domain.Estado;
import com.platzi.platzi.play.domain.Genero;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        Genero genre,
        Estado status,
        LocalDate releaseDate,
        Double rating
) {

}
