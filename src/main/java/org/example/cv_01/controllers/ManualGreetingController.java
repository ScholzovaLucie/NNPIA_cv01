package org.example.cv_01.controllers;

import org.springframework.stereotype.Controller;
import org.example.cv_01.services.GreetingService;

@Controller
public class ManualGreetingController {

    private GreetingService greetingService;

    public ManualGreetingController() {
        this.greetingService = new GreetingService();
    }

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }

}
