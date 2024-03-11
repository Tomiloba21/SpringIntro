package com.navin.telusko;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : Tomiloba Olowo
 * Date : 6th March, 2024
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * Using dependency Injection; we are making use of loose coupling
         * we can make use of the annotation injection
         * or the bean(xml) injection
         */
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
//         the parameter in the get bean is the id  in the bean tag
        Car obj = (Car) context.getBean(Car.class);
        obj.drive();


    }
}
