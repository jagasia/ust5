package com.ust.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfguration.class);
    	Car car = ctx.getBean(Car.class);
    	car.play();
    }
}
