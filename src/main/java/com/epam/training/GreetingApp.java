package com.epam.training;

import com.epam.training.simple.ConsoleMessageView;
import com.epam.training.simple.StaticGreetingMessageService;

public class GreetingApp {

    public void greet() {
        GreetingMessageService messageService = new StaticGreetingMessageService();
        MessageView messageView = new ConsoleMessageView();
        
        String message = messageService.getMessage();
        messageView.display(message);        
    }

}
