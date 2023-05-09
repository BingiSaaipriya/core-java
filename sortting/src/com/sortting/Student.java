package com.sortting;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	 private String address;
	 private double fee;
	 private char gender;
	

	 
	 public Student(int i,String name,String address,double d, char gender) {
		 super();
		 id=i;
		 this.name=name;
		 this.address=address;
		 this.fee=d;
		 this.gender=gender;
		
	 
	}

	public int getid() {
		 return id;
	 }
	 public void setid(int id) {
		 this.id=id;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name=name;
		  }
	 public String getaddress() {
		 return address;
	 }
	 public void setaddress(String address) {
		 this.address=address;
	 
	 }
	 public double getfee() {
		 return fee;
	 }
	 public void setfee(double fee) {
		 this.fee=fee;
	 }
		 @Override
		 public String toString() {
			 return "student[id="+id+",name="+name+",address="+address+",fee="+fee+"+,gender="+gender+"]";
		 }

		@Override
		public int compareTo(Student b) {
			//descending
			//return b.name.compareTo(this.name);
			return b.id-this.id;
		 
			//ascending order
		//	return this.id-b.id;
			//return this.name.compareTo(b.name);
			
		}

	
		}




		
		
	 



