package com.epam.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans-annotation.xml"); 

        String[] names = ctx.getBeanDefinitionNames();
        for (String bean : names) {
            System.out.println("next bean: " + bean);
            
        }
        
        GreetingApp app1 = ctx.getBean(GreetingApp.class);
        app1.greet();
        
    }
}
