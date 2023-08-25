package com.multilevelinheritance;

public class Notification  extends Customer{
String stockquantity="15";
//String str="15";
//int stock;
  @Override
	public void customer(String firstname, String address) {
	
		super.customer(firstname, address);
	}
public void stockofquantity() {
System.out.println("stock of quantity");

if(stockquantity!=null) {
	System.out.println("in stock");
}else {
	System.out.println("out of stock");


}



 

}
	
	 
}

	








