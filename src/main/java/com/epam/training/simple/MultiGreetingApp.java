package com.epam.training.simple;

import java.util.List;

import com.epam.training.GreetingApp;
import com.epam.training.GreetingMessageService;
import com.epam.training.MessageView;

public class MultiGreetingApp implements GreetingApp {

    private List<MessageView> views;
    private GreetingMessageService messagesService;
    
    public MultiGreetingApp(GreetingMessageService messagesService) {
        this.messagesService = messagesService;
    }


    public void greet() {
        String message = messagesService.getMessage();
        for (MessageView view : views) {
            view.display(message);
        }
    }


    public void setViews(List<MessageView> views) {
        this.views = views;
    }

}
