package org.example.cv_01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.example.cv_01.services.GreetingService;

@Controller
public class SetterInjectionGreetingController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }
}
