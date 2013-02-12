package com.epam.training.simple;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import com.epam.training.MessageView;

@Component("messageView")
public class I18NMessageView implements MessageView, MessageSourceAware {

    private Logger logger = LoggerFactory.getLogger(I18NMessageView.class);
    private final Locale locale;
    private MessageSource messageSource;
    
    @Autowired
    public I18NMessageView(@Value("${greeting.locale}")Locale locale) {
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
