package com.abstractclass;

public  abstract class Network {
	private int id;
	private  String name;
	String address;
	
	public Network(String name) {
		this.name=name;
	}
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String aa) {
		this.address=aa;
	}
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	
	public void  setname(String nn) {
		name=nn;
	}
	public void setid(int id) {
		this.id=id;
	}
	
	
	
	
	
	
	public abstract void callrates();
	public abstract void datarates();

}
