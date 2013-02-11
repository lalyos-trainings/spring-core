package com.epam.training;

import org.springframework.beans.factory.BeanNameAware;

public class GreetingApp implements BeanNameAware {

    private final GreetingMessageService messageService;
    private final MessageView messageView;
    private String beanName;
    
    public GreetingApp(GreetingMessageService messageService, MessageView messageView) {
        this.messageService = messageService;
        this.messageView = messageView;        
    }
    
    public void greet() {
        String message = messageService.getMessage();
        messageView.display("[" + beanName + "] {" + hashCode() + "}" + message);        
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
        
    }

}
