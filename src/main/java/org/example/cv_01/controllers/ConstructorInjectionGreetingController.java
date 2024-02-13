package org.example.cv_01.controllers;

import org.springframework.stereotype.Controller;
import org.example.cv_01.services.GreetingService;


@Controller
public class ConstructorInjectionGreetingController {

    private final GreetingService greetingService;

    public ConstructorInjectionGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }
}
