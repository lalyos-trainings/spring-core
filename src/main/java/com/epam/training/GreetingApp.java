package com.epam.training;

import com.epam.training.simple.ConsoleMessageView;
import com.epam.training.simple.StaticGreetingMessageService;

public class GreetingApp {

    private GreetingMessageService messageService;
    private MessageView messageView;
    
    public GreetingApp() {
        messageService = new StaticGreetingMessageService();
        messageView = new ConsoleMessageView();
    }
    
    public void greet() {
        String message = messageService.getMessage();
        messageView.display(message);        
    }

}
