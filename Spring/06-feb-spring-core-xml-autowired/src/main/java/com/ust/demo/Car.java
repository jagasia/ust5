package com.ust.demo;

public class Car {
	private Sony sony;
	
	public Car() {}

	public Car(Sony sony) {
		super();
		this.sony = sony;
	}

	public Sony getSony() {
		return sony;
	}

	public void setSony(Sony sony) {
		this.sony = sony;
	}
	
	public void play()
	{
		sony.playMusic();
	}
}
