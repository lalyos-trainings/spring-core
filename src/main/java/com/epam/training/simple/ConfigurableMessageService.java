package com.epam.training.simple;

import com.epam.training.GreetingMessageService;

public class ConfigurableMessageService implements GreetingMessageService {

    private String message;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
