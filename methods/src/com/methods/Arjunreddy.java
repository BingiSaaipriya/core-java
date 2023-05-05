package com.methods;

public class Arjunreddy  extends Movie{
	@Override
	public void realese() {
		System.out.println("movie realese on dec");
	}
	@Override
	public void starts() {
		System.out.println("movie  starts on mon");
	}
	@Override
	public void stops() {
	System.out.println("movie has been stopped");
	}
	
	@Override
	public void ends() {
		System.out.println("movie ends on jan");
	}

	
	public static void main(String[] args) {
	Arjunreddy aa=new Arjunreddy();
	aa.realese();
	aa.stops();
	aa.starts();
	aa.ends();
	
	
	}
}
