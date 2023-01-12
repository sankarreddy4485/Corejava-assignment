package com.assignment3;

public class WildAnimal extends Animal {

	@Override
	public void eat() {
		System.out.println("Wildanimal:EAT");

	}

	@Override
	public void sleep() {
		System.out.println("WildAnimal:sleep");
	}
	public void kill() {
		System.out.println("WildAnimal:Kill");
	}

}
