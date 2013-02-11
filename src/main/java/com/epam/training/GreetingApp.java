package com.epam.training;

public class GreetingApp {

    private final GreetingMessageService messageService;
    private final MessageView messageView;
    
    public GreetingApp(GreetingMessageService messageService, MessageView messageView) {
        this.messageService = messageService;
        this.messageView = messageView;        
    }
    
    public void greet() {
        String message = messageService.getMessage();
        messageView.display(message);        
    }

}
