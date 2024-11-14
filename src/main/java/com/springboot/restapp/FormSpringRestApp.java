package com.springboot.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormSpringRestApp {
    public static void main(String[] args) {
        /*ApplicationContext context = SpringApplication.run(SpringrestApplication.class, args);
        FormService formService = context.getBean(FormServiceImple.class);*/

        SpringApplication.run(FormSpringRestApp.class, args);
    }
}
