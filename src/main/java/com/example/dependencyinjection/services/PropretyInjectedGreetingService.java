package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropretyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello World - Proprtety";
    }
}
