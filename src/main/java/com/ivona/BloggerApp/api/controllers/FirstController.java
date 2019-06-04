package com.ivona.BloggerApp.api.controllers;

import com.ivona.BloggerApp.bll.services.FirstService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/first")
public class FirstController {

    private FirstService service;

    public FirstController(FirstService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> getRandomString () {
        String toReturn = service.getRandomString();
        return ResponseEntity.ok().body(toReturn);
    }
}