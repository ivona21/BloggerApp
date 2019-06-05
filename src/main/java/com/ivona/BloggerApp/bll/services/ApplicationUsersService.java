package com.ivona.BloggerApp.bll.services;

import com.ivona.BloggerApp.dal.models.ApplicationUser;
import com.ivona.BloggerApp.dal.repositories.ApplicationUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApplicationUsersService implements BllService {
    @Autowired
    private ApplicationUsersRepository repository;

    public List<ApplicationUser> getAllApplicationUsers(){
        List<ApplicationUser> users = repository.findAll();
        return users;
    }

    public ApplicationUser getUserByUsername(String username) {
        ApplicationUser foundUser = repository.findByUsername(username);
        return foundUser;
    }
}