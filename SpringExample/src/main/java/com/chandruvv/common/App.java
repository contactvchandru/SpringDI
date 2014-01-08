package com.chandruvv.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        
        HelloWorld obj1 = (HelloWorld) context.getBean("conbean");
        obj1.printHello();

        HelloWorld obj2 = (HelloWorld) context.getBean("conbean1");
        obj2.printHello();
        

    }
}
