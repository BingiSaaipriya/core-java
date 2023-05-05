package com.methods;

public class Movie {
	public void realese() {
		System.out.println("movie has been realesed");
	}
	public void starts() {
		System.out.println("movie starts");
	}
	public void stops() {
		System.out.println("movie stops");
	}
	public void ends() {
		System.out.println("movie ends");
	}
	
	public static void main(String[] args) {
		Movie movies=new Movie();
		movies.realese();
		movies.starts();
		movies.stops();
		movies.ends();
		
		
		
		
	}

}
