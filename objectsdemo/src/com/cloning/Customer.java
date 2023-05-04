package com.cloning;

public class Customer  implements Cloneable {
	private int id;
	private String name;
	private String address;
	
	public Customer() {
		
	}
	

	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer originalobject = new Customer(1,"sss","hyd");
		System.out.println(originalobject);
		Customer clonedobject=(Customer)originalobject.clone();
		System.out.println(clonedobject);
//after updating original object is different and cloned object is same
	originalobject.setName("hshgh");
	System.out.println(originalobject);
	System.out.println(clonedobject);
			
	}
}
