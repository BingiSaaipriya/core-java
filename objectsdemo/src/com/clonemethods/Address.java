package com.clonemethods;

public class Address  implements Cloneable{
	private int id;
	private String city;
	private String state;
	private String pincode;
	
  
	public Address(int id,String state,String city,String pincode) {
		super();
		this.id=id;
		this.state=state;
		this.city=city;
		this.pincode=pincode;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	public String getstate() {
		return state;
	}
	public void setstate(String state) {
		this.state=state;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public String getpincode() {
		return pincode;
	}
	public void setpincode(String pincode) {
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		return "Address[id="+id+",state="+state+",city="+city+",pincode="+pincode+"]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
