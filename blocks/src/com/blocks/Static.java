package com.blocks;

public class Static {
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
public static void main(String[] args) {
	Static ss=new Static();
}
}
