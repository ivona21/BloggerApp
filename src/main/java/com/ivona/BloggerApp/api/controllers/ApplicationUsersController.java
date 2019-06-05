package com.ivona.BloggerApp.api.controllers;

import com.ivona.BloggerApp.bll.models.ApplicationUserProfile;
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
    public ResponseEntity<List<ApplicationUserProfile>> all(){
        List<ApplicationUserProfile> users = service.getAllApplicationUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{username}")
    public ResponseEntity<ApplicationUserProfile> getByUsername(@PathVariable String username) {
        ApplicationUserProfile user = service.getUserByUsername(username);
        return ResponseEntity.ok().body(user);
    }
}