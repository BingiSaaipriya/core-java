package com.arrays;

import java.util.Arrays;

public class Sorttingarrays {
	public static void main(String[] args) {
		int [] arra=new  int[] {12,99,34,10,32};
		System.out.println("array elements after ");
		for(int i=0;i<arra.length;i++) {
			for(int j=1+1; j<arra.length;j++) {
				int temp=0;
				if(arra[i]>arra[j]) {
					
					temp=arra[i];
					arra[i]=arra[j];
					arra[j]=temp;
				}
				
			}
			System.out.println(arra[i]);
			
		}
	
		
		

	}
	}


