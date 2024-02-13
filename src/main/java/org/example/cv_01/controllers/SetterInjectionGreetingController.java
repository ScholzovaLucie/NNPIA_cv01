package org.example.cv_01.controllers;


import org.example.cv_01.services.GreetingService;


public class SetterInjectionGreetingController {
    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }
}
