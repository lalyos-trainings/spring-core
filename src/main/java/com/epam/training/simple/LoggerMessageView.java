package com.epam.training.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.training.MessageView;

public class LoggerMessageView implements MessageView {

    private Logger logger = LoggerFactory.getLogger(LoggerMessageView.class);
    public void display(String message) {
        logger.info(message);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
