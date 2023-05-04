package com.exampleprograms;

public class Orderprice {
	public static void main(String[] args) {
		double price=36999.00;
		
	double	twentypercentdiscount=((price)*20)/100;
	System.out.println(twentypercentdiscount);
	
	double tenpercentdiscountcard=((price)*10)/100;
	System.out.println(tenpercentdiscountcard);
	
	double totaldiscount=twentypercentdiscount+tenpercentdiscountcard;
	System.out.println(totaldiscount+" "+"is the totaldiscount");
	
	double cgst=((price)*3)/100;
	System.out.println(cgst);
	
	double sgst=((price)*2)/100;
	System.out.println(sgst);
	
	double gst=sgst+cgst;
	System.out.println(gst);
	
	double wholediscount=totaldiscount+gst;
	System.out.println(wholediscount);
	
	double orderprice=price-wholediscount;
	System.out.println(orderprice);
	
	}

}
