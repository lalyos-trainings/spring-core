package com.epam.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
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
        ClassPathResource cpresource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(cpresource);
        GreetingApp app1 = factory.getBean("multiGreeting",GreetingApp.class);
        app1.greet();
        
    }
}
