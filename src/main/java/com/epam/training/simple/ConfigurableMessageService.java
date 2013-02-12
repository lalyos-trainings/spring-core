package com.epam.training.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.epam.training.GreetingMessageService;

@Component("messageService")
public class ConfigurableMessageService implements GreetingMessageService {

    private String message;
    
    public String getMessage() {
        return message;
    }

    @Value("msg.lunch")
    public void setMessage(String message) {
        this.message = message;
    }

}
