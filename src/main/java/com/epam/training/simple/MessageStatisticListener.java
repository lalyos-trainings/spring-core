package com.epam.training.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MessageStatisticListener implements ApplicationListener {

    private Logger logger = LoggerFactory.getLogger(MessageStatisticListener.class);
    private int counter = 0;
    private int pricePerMessage;
    
    public MessageStatisticListener(int pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
    }


    public void onApplicationEvent(ApplicationEvent event) {
        logger.debug(event.toString());
        counter++;
        logger.info("Num of messages till now: " + counter);
        logger.info("Total price of all messages: " + counter*pricePerMessage);
    }


}
