package com.Interface;

public   interface Network {
	
	public abstract  void callrate();
	default  void def() {
		System.out.println("if we want to add body for  interface  we can use default modifier");
	}
	void datarates();

}
