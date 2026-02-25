package com.platzi.platzi.play.domain.dto;

import com.platzi.platzi.play.domain.Genero;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        Genero genre,
        LocalDate releaseDate,
        Double rating
) {

}
