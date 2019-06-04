package com.example.BloggerApp.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/first")
public class FirstController {

    @GetMapping
    public ResponseEntity<String> getRandomString () {
        return ResponseEntity.ok().body("My name is Ivona");
    }
}