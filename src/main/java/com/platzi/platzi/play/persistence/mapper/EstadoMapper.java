package com.platzi.platzi.play.persistence.mapper;

import com.platzi.platzi.play.domain.Estado;
import org.mapstruct.Named;

import java.util.Locale;

public class EstadoMapper {

    @Named("estadoToString")
    public static Estado estadoToString (String estado){
        if (estado == null) return null;

        return switch (estado.toUpperCase()){
            case "D" -> Estado.TRUE;
            case "F" -> Estado.FALSE;
            default -> null;
        };
    }

    @Named("stringToEstado")
    public static String stringToEstado(Estado estado){
        if (estado == null) return null;

        return switch (estado){
            case TRUE -> "D";
            case FALSE -> "F";
            default -> null;
        };
    }
}
