package com.platzi.platzi.play.persistence.mapper;

import com.platzi.platzi.play.domain.Genero;
import org.mapstruct.Named;

public class GenreMapper {

    @Named("stringToGener")
    public static Genero stringToGenre(String genero){
        if (genero == null){
            return null;
        }

        return switch(genero.toUpperCase()){
            case "ACCION" -> Genero.ACTION;
            case "COMEDIA" -> Genero.COMEDY;
            case "DRAMA" -> Genero.DRAMA;
            case "ANIMADA" -> Genero.ANIMATED;
            case "CIENCIA_FICCION" -> Genero.SCI_FCI;
            case "TERROR" -> Genero.HORROR;
            case "ROMANCE" -> Genero.ROMANCE;
            case "DEPORTE" -> Genero.SPORT;
            default -> null;
        };
    }

    @Named("GenerToString")
    public static String GenreToString(Genero genero){
        if (genero == null){
            return null;
        }

        return switch (genero){
            case ACTION -> "ACCION";
            case COMEDY -> "COMEDIA";
            case HORROR -> "TERROR";
            case SPORT -> "DEPORTE";
            case DRAMA -> "DRAMA";
            case SCI_FCI -> "CIENCIA FICCION";
            case ROMANCE -> "ROMANCE";
            default -> null;
        };
    }
}
