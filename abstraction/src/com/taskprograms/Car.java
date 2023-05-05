package com.taskprograms;

public abstract class Car extends Vechicle {

	public Car(String name) {
		super(name);
	
		
	}
	

	
@Override
public void enginee() {
	System.out.println(getname()+" "+"enginee");
	
}
@Override
public void stops() {
	System.out.println(getname()+" "+"the vechicle has been stopped");
}

@Override
public void starts() {
	System.out.println(getname()+" "+"vechicle is starting");
}

public abstract void colour();
	

}
