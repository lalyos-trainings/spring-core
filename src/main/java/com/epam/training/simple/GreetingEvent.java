package com.epam.training.simple;

import java.util.Locale;

import org.springframework.context.ApplicationEvent;

public class GreetingEvent extends ApplicationEvent {

    private String message;
    private Locale locale;
    
    public GreetingEvent(Object source, String message, Locale locale) {
        super(source);
        this.message = message;
        this.locale = locale;
    }

    public String getMessage() {
        return message;
    }

    public Locale getLocale() {
        return locale;
    }
}
