package com.test.singtel.sectionD;

import com.test.singtel.interfaces.Flyers;

public class Butterfly implements Flyers {

	public Butterfly() {
		sound();
		fly();
	}

	@Override
	public void fly() {
		System.out.println("Butterfly can fly");

	}

	public void sound() {
		System.out.println("Butterfly dont make sound");
	}

}