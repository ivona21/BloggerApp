package com.ivona.BloggerApp.api.controllers;

import com.ivona.BloggerApp.bll.models.UserProfile;
import com.ivona.BloggerApp.bll.services.UserProfilesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class UserProfilesController extends ApiController {
    private UserProfilesService service;

    public UserProfilesController(UserProfilesService service) {
        super(service);
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserProfile>> all(){
        List<UserProfile> users = service.getAllApplicationUserProfiles();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserProfile> getByUsername(@PathVariable String username) {
        UserProfile user = service.getUserProfileByUsername(username);
        return ResponseEntity.ok().body(user);
    }
}