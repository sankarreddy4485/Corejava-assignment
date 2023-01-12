package com.assignment3;

public class Bird extends Animal {

	@Override
	public void eat() {

		System.out.println("Bird :EAT");

	}

	@Override
	public void sleep() {
		System.out.println("Bird :Sleep");

	}

	public void fly() {

		System.out.println("Bird will fly");
	}
}
