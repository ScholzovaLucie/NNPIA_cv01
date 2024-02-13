package org.example.cv_01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.example.cv_01.services.GreetingService;

public class FieldInjectionGreetingController {

    public GreetingService greetingService;

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }
}
