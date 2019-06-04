package com.example.BloggerApp;

import com.example.BloggerApp.api.controllers.FirstController;
import com.example.BloggerApp.bll.controllers.FirstService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public FirstService service() {
        return new FirstService();
    }

    public FirstController controller() {
        return new FirstController(service());
    }
}