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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml"); 
        
        GreetingApp app1 = ctx.getBean("simpleGreeting",GreetingApp.class);
        app1.greet();
        
    }
}
