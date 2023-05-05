package com.Examprograms;

public class Primenumber {
	public static void main(String[] args) {

		int n=11;
 int m=0;
 for(int i=1;i<=n;i++) {
	 if(n%i==0) {
		 m++;
	 }
 }
 if(m==2) {
	 System.out.println("prime ");
 }else {
	 System.out.println("not a prime");
 }
 
 
 
 //table printing
 
 int number=6;
 for(int i=1;i<=10;i++) {
	 System.out.println(number+"*"+i+"="+number*i);
 }
 
 //even number printing
 
 int num=6;
 
	 if(num%2==0) {
		 System.out.println("even");
		  }else {
			  System.out.println("not a even");
		  }
	 
	 int nu=9;
	 if(nu%2==1) {
		 System.out.println("odd");
	 }else {
		 System.out.println("not a odd number");
	 }
	 
	 //fibonacci series
	 
	 
	 int n1=0,n2=1,n3,i,count=10;    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 
 }

 
 
	 
 }
}
	


