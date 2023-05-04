package com.innerclasses;

public class Outer {
	private int id;
	private String name;
	
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void getdata() {
		System.out.println("outer id:"+id);
		System.out.println("outer name:"+name);
	}
	
	
	public class innerclass{
		private String colour;
		
		public void setcolour(String colour) {
			this.colour=colour;
		}
		public void getcolour() {
			System.out.println("colour name:"+name);
			System.out.println(id+name);
			getdata();
		}
		public static void main(String[] args) {
			Outer oo=new Outer();
			oo.id=9;
			oo.name="welcome";
			oo.getdata();
		}
	}
}


