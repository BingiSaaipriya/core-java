package com.stringmethods;

public class Stringbuildeexamples {
	public static void main(String[] args) {
		
		StringBuilder v=new StringBuilder();
		System.out.println(v.capacity());//default value is 16
		v.append("helloworld");//now 16
		System.out.println(v.capacity());
		v.append("this is my favourite colour");//(16*2)+2=37
		
		System.out.println(v.capacity());
		
		//append: for changing the data
		
		StringBuilder v2=new StringBuilder("hello");
	System.out.println(v2);
	v2.append("everyone");
	System.out.println(v2);
	v2.append("wlcome to java programming");
	System.out.println(v2);
	
	//insert method
	StringBuilder v3=new StringBuilder("helloeveryone");
	v3.insert(1, "java");
	System.out.println(v3);
		
	//replace method
	StringBuilder v4=new StringBuilder("hii");
	v4.insert(2, "hello");
	System.out.println(v4);
	
	//delete method
	StringBuilder v5=new StringBuilder("java member");
	v5.delete(2, 4);
	System.out.println(v5);
	
	//reverse method
	StringBuilder v6=new StringBuilder("chinnu");
	v6.reverse();
	System.out.println(v6);
	
	//ensure capacity
	StringBuilder v7=new StringBuilder();
System.out.println(v7.capacity());
v7.append("welcome");
System.out.println(v7.capacity());
v7.append("to core java");
System.out.println(v7.capacity());
v7.ensureCapacity(4);
System.out.println(v7.capacity());
v7.ensureCapacity(44);
System.out.println(v7.capacity());
		
		
	StringBuilder b1=new StringBuilder();
	System.out.println(b1.capacity());
	b1.append("welcome");
	System.out.println(b1.capacity());
	b1.append("how are you");
	System.out.println(b1.capacity());
	
	StringBuilder b2=new StringBuilder("where are you");
	System.out.println(b2);
	b2.append("are you there");
	System.out.println(b2);
	
	StringBuilder b3=new StringBuilder("what are you doing here");
	b3.insert(4,"are" );
	System.out.println(b3);
	
	StringBuilder b4 =new StringBuilder("this");
	b4.deleteCharAt(3);
	System.out.println(b4);
	
	StringBuilder b5=new StringBuilder("my name is priya");
	b5.replace(2, 8, "self");
	System.out.println(b5);
	
	StringBuilder b6=new StringBuilder("priya");
	b6.reverse();
	System.out.println(b6);
	
		
		
}
}