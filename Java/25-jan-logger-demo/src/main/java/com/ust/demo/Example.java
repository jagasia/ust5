package com.ust.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {

	 Logger lf=LoggerFactory.getLogger(Example.class);
	public void display()
	{
		lf.warn("This is my warning");
		for(int i=0;i<20;i++)
		{
			System.out.println(i);
		}
	}
}
