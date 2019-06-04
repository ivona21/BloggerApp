package com.ivona.BloggerApp;

import com.ivona.BloggerApp.api.controllers.FirstController;
import com.ivona.BloggerApp.bll.services.FirstService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public FirstService firstService(){
        return new FirstService(){};
    }

    public FirstController firstController() {
        return new FirstController(firstService());
    }
}