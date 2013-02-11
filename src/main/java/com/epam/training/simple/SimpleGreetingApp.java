package com.epam.training.simple;

import org.springframework.beans.factory.BeanNameAware;

import com.epam.training.GreetingApp;
import com.epam.training.GreetingMessageService;
import com.epam.training.MessageView;

public class SimpleGreetingApp implements BeanNameAware, GreetingApp {

    private final GreetingMessageService messageService;
    private final MessageView messageView;
    private String beanName;
    
    public SimpleGreetingApp(GreetingMessageService messageService, MessageView messageView) {
        this.messageService = messageService;
        this.messageView = messageView;        
    }
    
    /* (non-Javadoc)
     * @see com.epam.training.simple.GreetingApp#greet()
     */
    public void greet() {
        String message = messageService.getMessage();
        messageView.display(message);        
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
        
    }

}
