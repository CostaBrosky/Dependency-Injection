package com.example.dependencyinjection.controller;

import com.example.dependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PropretyInjectedControllerTest {

    PropretyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropretyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}