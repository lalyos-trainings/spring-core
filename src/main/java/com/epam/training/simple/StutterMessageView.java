package com.epam.training.simple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.epam.training.MessageView;

@Component
@Qualifier("multiview")
public class StutterMessageView implements MessageView {

    private int count;
    
    public void display(String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }

    }

    @Value("3")
    public void setCount(int count) {
        this.count = count;
    }

}
