package com.epam.training.simple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.epam.training.MessageView;

@Component
@Qualifier("multiview")
public class ConsoleMessageView implements MessageView {

    public void display(String message) {
        System.out.println("### msg: " + message);
    }

}
