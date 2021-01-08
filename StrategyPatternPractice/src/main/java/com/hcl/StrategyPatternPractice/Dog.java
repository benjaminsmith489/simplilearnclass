package com.hcl.StrategyPatternPractice;

public class Dog extends Animal implements MovementStrategy, SoundStrategy {

	private String name;
	private String sound;
	
	
	@Override
	public void move() {
		System.out.printf("%s is running around hapily\n", this.name);
		
	}


	@Override
	public void makeSound() {
		System.out.printf("%s\n",this.sound);
		
	}
	
	
}
