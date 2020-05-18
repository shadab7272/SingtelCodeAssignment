package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Parrot implements Birds {
	
	Object house;

	public Parrot(Object house) {
		this.house = house;
	}

	public void sound() {
		String sound = ((house instanceof Dog)? "Woof , woof" : house instanceof Cat ? "Meow" : house instanceof Rooster ? "Cock-a-doodle-doo" : "Buck Buck");
			System.out.println("Parrot says " + sound);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}