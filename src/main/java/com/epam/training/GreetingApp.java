package com.epam.training;

import com.epam.training.simple.ConsoleMessageView;
import com.epam.training.simple.StaticGreetingMessageService;

public class GreetingApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        GreetingMessageService messageService = new StaticGreetingMessageService();
        MessageView messageView = new ConsoleMessageView();
        
        String message = messageService.getMessage();
        messageView.display(message);

    }

}
