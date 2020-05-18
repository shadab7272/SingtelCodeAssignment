package com.test.singtel.sectionD;

import com.test.singtel.interfaces.Flyers;

public class CaterPillar implements Flyers{

@Override
public void fly() {
	System.out.println("CaterPillar cannot fly");
	
}

public void walk(){
	System.out.println("CaterPillar can crawl");
}

}