package org.example.spring.controller;

import org.example.spring.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {
    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/1")
    public User getUser() {
        return new User("Сан", "Саныч", 69);
    }
}
