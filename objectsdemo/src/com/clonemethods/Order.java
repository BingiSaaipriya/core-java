package com.clonemethods;

public class Order implements Cloneable{
	private int id;
	private String orderstatus;
	public Order(int id, String orderstatus) {
		super();
		this.id = id;
		this.orderstatus = orderstatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderstatus=" + orderstatus + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	}
	


