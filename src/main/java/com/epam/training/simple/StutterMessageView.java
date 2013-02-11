package com.epam.training.simple;

import com.epam.training.MessageView;

public class StutterMessageView implements MessageView {

    private int count;
    
    public void display(String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }

    }

    public void setCount(int count) {
        this.count = count;
    }

}
