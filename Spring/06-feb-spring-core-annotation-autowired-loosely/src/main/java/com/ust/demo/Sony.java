package com.ust.demo;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Audio{
	public void playMusic()
	{
		System.out.println("Sony plays good music");
	}
}
