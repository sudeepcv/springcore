package com.basicsinjavablogspot;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world! spring core
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        creating and using application context
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person p1=context.getBean("Person",Person.class);

//      creating and using factory bean
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/context.xml"));
        Person p2=factory.getBean("Person",Person.class);



    }
}
