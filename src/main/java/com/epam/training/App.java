package com.epam.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

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
        GreetingApp app = (GreetingApp) factory.getBean("greetingApp");
        app.greet();
        
    }
}
