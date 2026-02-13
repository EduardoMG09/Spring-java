package com.platzi.platzi.play;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

//Creamos un servicio que va a:
// Procesar datos
// Ejecutar reglas de negocio
// Llamar APIs externas
// Hablar con la base de datos
// Hacer cálculos

@AiService
public interface PlatziPlayAiService {
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de peliculas {{platform}}.
            Usa menos de 120 caracteres y hazlo estilo platzi
            """)
    String generateGreeting(@V("platform") String plataform);
}
