package com.assignment3;

public class AbstarctDemo {

	public static void main(String[] args) {
		
		Bird bird= new Bird();
	    System.out.println("Bird class instances");
	    bird.eat();
	    bird.sleep();
	    bird.fly();

	    WildAnimal wildAnimal= new WildAnimal();
	    System.out.println("Wild class Instacee");
	    wildAnimal.eat();
	    wildAnimal.sleep();
	    wildAnimal.kill();

	 

	    System.out.println("Animal refernce with Bird class instance");
	    Animal birdAnimal=new Bird();
	    birdAnimal.eat();
	    birdAnimal.sleep();

	 

	    System.out.println("Animal refernce with WildAnimal class instance");
	    Animal wildAni=new WildAnimal();
	    wildAni.eat();
	    wildAni.sleep(); 

	}

}
