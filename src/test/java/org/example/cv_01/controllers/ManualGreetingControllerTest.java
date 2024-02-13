package org.example.cv_01.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManualGreetingControllerTest {

    @Test
    void sayHellow() {
        ManualGreetingController controller = new ManualGreetingController();

        System.out.println(controller.sayHellow());
    }
}