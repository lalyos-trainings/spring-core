package com.epam.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.StaticMessageSource;
import org.springframework.stereotype.Component;

import com.epam.training.GreetingApp;
import com.epam.training.GreetingMessageService;
import com.epam.training.MessageView;
import com.epam.training.simple.ConsoleMessageView;
import com.epam.training.simple.SimpleGreetingApp;
import com.epam.training.simple.StaticGreetingMessageService;

@Configuration
@Component
public class GreetingConfig  {

    @Bean
    public MessageView view() {
        return new ConsoleMessageView();
    }
    
    @Bean
    public GreetingMessageService messageService() {
        return new StaticGreetingMessageService();
    }
    
    @Bean
    public GreetingApp greeting() {
        SimpleGreetingApp app = new SimpleGreetingApp(messageService(), view());
        return app;
    }
}
