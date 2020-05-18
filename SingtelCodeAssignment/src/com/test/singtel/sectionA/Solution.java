package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Animal;
import com.test.singtel.interfaces.Birds;

public class Solution {

	public static void main(String[] args) {
		Animal animal = new Bird();
		animal.sing();
		animal.fly();
		
		animal.walk();
		
		Birds duckBird = new Duck();
		duckBird.sound();
		
		Rooster rooster = new Rooster("Cock-a-doodle-doo");
		Birds chickenBird = new Chicken("Clcuk cluck", rooster);
		chickenBird.sound();
		
		rooster.sound();
	}

}
