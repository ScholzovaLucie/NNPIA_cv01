package org.example.cv_01.controllers;

import org.example.cv_01.services.GreetingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldInjectionGreetingControllerTest {

    @Test
    void sayHellow() {
        GreetingService service = new GreetingService() ;
        FieldInjectionGreetingController controller = new FieldInjectionGreetingController(service);

        System.out.println(controller.sayHellow());
    }
}