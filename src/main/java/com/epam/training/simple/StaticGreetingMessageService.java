package com.epam.training.simple;

import com.epam.training.GreetingMessageService;

public class StaticGreetingMessageService implements GreetingMessageService {

    public String getMessage() {
        
        return "Hello Spring!";
    }

}
