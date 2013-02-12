package com.epam.training.simple;

import org.springframework.stereotype.Component;

import com.epam.training.GreetingMessageService;

@Component
public class StaticGreetingMessageService implements GreetingMessageService {

    public String getMessage() {
        
        return "Hello Spring!";
    }

}
