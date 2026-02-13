package com.platzi.platzi.play.web.controller;

import com.platzi.platzi.play.domain.services.PlatziPlayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Un RestController en Spring es una clase especial para crear APIs RESTful, que combina @Controller y @ResponseBody, permitiendo que los métodos devuelvan directamente datos (como JSON o XML)
@RestController
public class HelloController {
    private final String platform;
    private final PlatziPlayAiService aiService;

    public HelloController(@Value("${spring.application.name}")String platform ,PlatziPlayAiService aiService){
        this.aiService = aiService;
        this.platform = platform;
    }

    @GetMapping("/")
    public String hello(){
        return this.aiService.generateGreeting(platform);
    }

}
