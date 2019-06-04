package com.ivona.BloggerApp;

import com.ivona.BloggerApp.api.controllers.ApplicationUsersController;
import com.ivona.BloggerApp.api.controllers.FirstController;
import com.ivona.BloggerApp.bll.services.ApplicationUsersService;
import com.ivona.BloggerApp.bll.services.FirstService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public FirstService firstService(){ return new FirstService(){};}

    @Bean
    public ApplicationUsersService applicationUsersService(){ return new ApplicationUsersService(){}; }

    //injecting services into controllers;
    public FirstController firstController() { return new FirstController(firstService());  }
    public ApplicationUsersController applicationUsersController(){ return new ApplicationUsersController(applicationUsersService()){};}
}