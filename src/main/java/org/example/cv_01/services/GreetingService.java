package org.example.cv_01.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingService implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello";
    }
}
