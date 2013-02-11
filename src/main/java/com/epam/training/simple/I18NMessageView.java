package com.epam.training.simple;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import com.epam.training.MessageView;

public class I18NMessageView implements MessageView, MessageSourceAware {

    private Logger logger = LoggerFactory.getLogger(I18NMessageView.class);
    private final Locale locale;
    private MessageSource messageSource;
    
    public I18NMessageView(Locale locale) {
        this.locale = locale;
    }

    public void display(String messageCode) {
        String message = messageSource.getMessage(messageCode, null, locale);
        
        logger.info(message);

    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
        // TODO Auto-generated method stub
        
    }

}
