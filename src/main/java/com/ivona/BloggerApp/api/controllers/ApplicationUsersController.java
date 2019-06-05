package com.ivona.BloggerApp.api.controllers;

import com.ivona.BloggerApp.bll.services.ApplicationUsersService;
import com.ivona.BloggerApp.dal.models.ApplicationUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ApplicationUsersController extends ApiController {
    private ApplicationUsersService service;

    public ApplicationUsersController(ApplicationUsersService service) {
        super(service);
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ApplicationUser>> all(){
        List<ApplicationUser> users = service.getAllApplicationUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{username}")
    public ResponseEntity<ApplicationUser> getByUsername(@PathVariable String username) {
        ApplicationUser user = service.getUserByUsername(username);
        return ResponseEntity.ok().body(user);
    }
}