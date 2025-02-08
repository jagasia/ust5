package com.ust.demo;

import org.springframework.stereotype.Component;

@Component("jbl")
public class Jbl implements Audio{
	public void playMusic()
	{
		System.out.println("The music from Jbl speakers are nice");
	}
}
