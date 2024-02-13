package org.example.cv_01.controllers;


import org.example.cv_01.services.GreetingService;


public class ManualGreetingController {

    private GreetingService greetingService;

    public ManualGreetingController() {
        this.greetingService = new GreetingService();
    }

    public String sayHellow(){
        return  greetingService.sayGreeting();
    }

}
