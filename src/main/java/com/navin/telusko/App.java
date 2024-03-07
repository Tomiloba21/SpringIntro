package com.navin.telusko;

//import org.springframework.beans.factory.BeanFactory;
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
        /**
         * Using dependency Injection; we are making use of loose coupling
         */
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        // the parameter in the get bean is the id  in the bean tag
        Car obj = (Car) context.getBean("car");
        obj.drive();

    }
}
