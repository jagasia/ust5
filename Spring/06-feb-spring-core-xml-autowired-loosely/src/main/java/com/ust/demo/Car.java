package com.ust.demo;

public class Car
{
	private Audio audio;
	
	public Car() {}

	public Car(Audio audio) {
		super();
		this.audio = audio;
	}

	public Audio getAudioi() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio= audio;
	}
	
	public void play()
	{
		audio.playMusic();
	}
}
