package com.innaerclassjava;

public class Outer {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getdata() {
		System.out.println("outer id:"+id);
		System.out.println("outer name:"+name);
	}
	public class Innerclasses{
		
		private String colour;
		
		

		}
		
	
	
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.id=7;
		outer.name="priya";
		outer.getdata();
		
	}

}
