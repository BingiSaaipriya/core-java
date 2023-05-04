package com.javainnerclasses;

public class Outer {
	private int id;
	private String name;
	
	private int getid() {
		return id;
	}
	public String getname() {
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
	
	//non static nested class is called inner class
	public class Innerclass{
		private String colour;
		
		public void setcolour(String colour) {
			this.colour=colour;
		}
		
		public void getcolour() {
			System.out.println("colour name:"+colour);
			//we can access outer class properties also in innerclass
			//System.out.println(id+name);
			//getdata();
			
			
		}
	}
	
	
public static void main(String[] args) {
	Outer outer =new Outer();
	outer.id=9;
	outer.name="welcome";
	outer.getdata();
	Outer.Innerclass innerrefer = outer.new Innerclass();
	innerrefer.setcolour("blue");
	innerrefer.getcolour();
}

}
