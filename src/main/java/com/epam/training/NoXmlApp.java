package com.epam.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.training.config.GreetingConfig;

public class NoXmlApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(GreetingConfig.class);
        ctx.refresh();
        
        String[] names = ctx.getBeanDefinitionNames();
        for (String bean : names) {
            System.out.println("next bean: " + bean);
        }
        GreetingApp app = ctx.getBean(GreetingApp.class);
        app.greet();
    }

}
