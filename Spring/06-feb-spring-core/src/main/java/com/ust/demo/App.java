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
    	Mathematics m1 = ctx.getBean(Mathematics.class);
//    	Mathematics m2= ctx.getBean(Mathematics.class);
//    	m1.setNo1(100);
//    	m1.setNo2(100);
//    	
//    	m2.setNo1(200);
//    	m2.setNo2(200);
    	
    	System.out.println(m1.sum());
    	
    }
}
