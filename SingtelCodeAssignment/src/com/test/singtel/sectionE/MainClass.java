package com.test.singtel.sectionE;

import com.test.singtel.interfaces.AnimalInterface;
import com.test.singtel.sectionA.Bird;
import com.test.singtel.sectionA.Cat;
import com.test.singtel.sectionA.Chicken;
import com.test.singtel.sectionA.Dog;
import com.test.singtel.sectionA.Duck;
import com.test.singtel.sectionA.Parrot;
import com.test.singtel.sectionA.Rooster;
import com.test.singtel.sectionB.ClownFish;
import com.test.singtel.sectionB.Dolphins;
import com.test.singtel.sectionB.Fish;
import com.test.singtel.sectionB.Shark;
import com.test.singtel.sectionD.Butterfly;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalInterface[] animals = new AnimalInterface[]{
				new Bird(),
				(AnimalInterface) new Duck(),
				(AnimalInterface) new Chicken("Cluck, cluck", new Rooster("Cock-a-doodle-doo")),
				(AnimalInterface) new Rooster("Cock-a-doodle-doo"),
				(AnimalInterface) new Parrot(new Dog("Woof, woof")),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphins(),
				 (AnimalInterface) //new Frog(),
				 new Dog("Woof, woof"),
				new Butterfly(),
				(AnimalInterface) new Cat("Meow")
				};
	}

}
