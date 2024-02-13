package org.example.cv_01.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ManualGreetingControllerTest {
    @Autowired
    ManualGreetingController controller;

    @Test
    void sayHellow() {
        System.out.println(controller.sayHellow());
    }
}