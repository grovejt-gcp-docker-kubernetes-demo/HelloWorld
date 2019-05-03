package com.grovejt.helloworld.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // use the injected TARGET property (via system propert | properties file | ...)  - default to 'World'
    @Value("${TARGET:World}")
    String target;

    @GetMapping("/hello")
    public String hello(){
        return "Hello " + target + "!";
    }
}
