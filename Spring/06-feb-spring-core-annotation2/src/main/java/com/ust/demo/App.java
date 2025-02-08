package com.ust.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Mathematics maths=(Mathematics) ctx.getBean("maths");
		System.out.println(maths.sum());
	}

}
