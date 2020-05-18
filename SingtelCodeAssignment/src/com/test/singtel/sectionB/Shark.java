package com.test.singtel.sectionB;

import com.test.singtel.interfaces.WaterAnimal;

public class Shark implements WaterAnimal{
	
public Shark() {
	
	swim();
	size();
	 color() ;
	 features();
}
public void swim() {
	
	System.out.println("Shark can swim");
}
public void color() {
	
	System.out.println("Shark is in Grey Color");
}

public void size() {
	
	System.out.println("Shark are large");
}
public void features() {
	
	System.out.println("Shark eat other fish");
}
}
