package com.ust.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Book book = ctx.getBean(Book.class);
		System.out.println(book.getAuthors());
	}

}
