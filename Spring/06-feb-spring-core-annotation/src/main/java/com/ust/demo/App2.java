package com.ust.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
    	//represent the xml file as an object
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//    	ctx.scan("com");
//    	ctx.refresh();
    	Mathematics m = ctx.getBean(Mathematics.class);
    	System.out.println(m.sum());
        System.out.println( "Hello World!" );
    }
}
