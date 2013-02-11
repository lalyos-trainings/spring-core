package com.epam.training.simple;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.epam.training.MessageView;

public class I18NMessageView implements MessageView, ApplicationContextAware {

    private Logger logger = LoggerFactory.getLogger(I18NMessageView.class);
    private final Locale locale;
    private ApplicationContext applicationContext;
    
    public I18NMessageView(Locale locale) {
        this.locale = locale;
    }

    public void display(String messageCode) {
        logger.debug("messageCode: " + messageCode);
        String message = applicationContext.getMessage(messageCode, null, locale);
        logger.debug("message: " + message);
        
        logger.info(message);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        
    }

}
