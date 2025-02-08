package com.ust.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//represent the xml file as an object
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Car car = ctx.getBean(Car.class);
    	car.play();
    	
    }
}
