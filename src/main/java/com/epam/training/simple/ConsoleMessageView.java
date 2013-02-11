package com.epam.training.simple;

import com.epam.training.MessageView;

public class ConsoleMessageView implements MessageView {

    public void display(String message) {
        System.out.println("### msg: " + message);
    }

}
