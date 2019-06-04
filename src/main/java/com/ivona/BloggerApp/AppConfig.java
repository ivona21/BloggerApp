package com.ivona.BloggerApp;

import com.ivona.BloggerApp.controllers.FirstController;
import com.ivona.BloggerApp.bll.controllers.FirstService;
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