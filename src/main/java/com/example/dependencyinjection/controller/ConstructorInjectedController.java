package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    //in constructor injection @Autowired is not anymore neccesary, we don't need to use it
    //this tipe of Injection is the best and cleannest way to do it, just stick with this
    //if not just use @Autowired in case we want to use it without Constructor Injection
    //if we get rid of @Qualifier annotation, Spring will always use the @Primary one, if we implement one, if not an error will occur
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreetings();
    }
}
