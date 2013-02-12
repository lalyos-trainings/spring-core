package com.epam.training.simple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.epam.training.GreetingApp;
import com.epam.training.GreetingMessageService;
import com.epam.training.MessageView;

@Component
public class MultiGreetingApp implements GreetingApp {

    private List<MessageView> views;
    private GreetingMessageService messageService;
    
    @Autowired
    public MultiGreetingApp(GreetingMessageService messageService) {
        this.messageService = messageService;
    }


    public void greet() {
        String message = messageService.getMessage();
        for (MessageView view : views) {
            view.display(message);
        }
    }

    @Autowired
    @Qualifier("multiview")
    public void setViews(List<MessageView> views) {
        this.views = views;
    }

}
