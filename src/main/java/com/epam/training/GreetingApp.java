package com.epam.training;

import com.epam.training.simple.ConsoleMessageView;
import com.epam.training.simple.StaticGreetingMessageService;

public class GreetingApp {

    private GreetingMessageService messageService;
    private MessageView messageView;
    
    public GreetingApp() {
    }
    
    public void greet() {
        String message = messageService.getMessage();
        messageView.display(message);        
    }

    public void setMessageService(GreetingMessageService messageService) {
        this.messageService = messageService;
    }

    public void setMessageView(MessageView messageView) {
        this.messageView = messageView;
    }

}
