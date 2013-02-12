package com.epam.training.simple;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import com.epam.training.GreetingApp;
import com.epam.training.GreetingMessageService;
import com.epam.training.MessageView;

@Component
public class SimpleGreetingApp implements BeanNameAware, GreetingApp, ApplicationContextAware {

    private  GreetingMessageService messageService;
    private  MessageView messageView;
    private String beanName;
    private ApplicationContext applicationContext;
    
    public SimpleGreetingApp(GreetingMessageService messageService, MessageView messageView) {
        this.messageService = messageService;
        this.messageView = messageView;        
    }
    
    public SimpleGreetingApp() {
        super();
    }

    /* (non-Javadoc)
     * @see com.epam.training.simple.GreetingApp#greet()
     */
    public void greet() {
        String message = messageService.getMessage();
        messageView.display(message);
        GreetingEvent event = new GreetingEvent(this, message, null);
        
        applicationContext.publishEvent(event);
        
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
        
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setMessageService(GreetingMessageService messageService) {
        this.messageService = messageService;
    }

    public void setMessageView(MessageView messageView) {
        this.messageView = messageView;
    }

}
