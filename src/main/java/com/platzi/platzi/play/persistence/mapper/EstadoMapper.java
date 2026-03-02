package com.platzi.platzi.play.persistence.mapper;

import com.platzi.platzi.play.domain.Estado;
import org.mapstruct.Named;

public class EstadoMapper {

    @Named("stringToEstado")
    public static Estado stringToEstado (String estado){
        if (estado == null) return null;

        return switch (estado.toUpperCase()){
            case "D" -> Estado.TRUE;
            case "F" -> Estado.FALSE;
            default -> null;
        };
    }

    @Named("estadoToString")
    public static String estadoToString(Estado estado){
        if (estado == null) return null;

        return switch (estado){
            case TRUE -> "D";
            case FALSE -> "F";
            default -> null;
        };
    }
}
