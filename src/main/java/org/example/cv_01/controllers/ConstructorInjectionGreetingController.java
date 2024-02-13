package org.example.cv_01.controllers;


import org.example.cv_01.services.GreetingService;


public class ConstructorInjectionGreetingController {

    private final GreetingService greetingService;

    public ConstructorInjectionGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }
}
