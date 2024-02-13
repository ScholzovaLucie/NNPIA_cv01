package org.example.cv_01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.example.cv_01.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectionGreetingController {

    @Autowired
    public GreetingService greetingService;

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }
}
