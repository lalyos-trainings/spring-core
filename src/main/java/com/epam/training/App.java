package com.epam.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.epam.training.simple.SimpleGreetingApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FileSystemResource resource = new FileSystemResource("src/main/resources/beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        GreetingApp app1 = factory.getBean(SimpleGreetingApp.class);
        app1.greet();

        GreetingApp app2 = factory.getBean(SimpleGreetingApp.class);
        app2.greet();
        
    }
}
