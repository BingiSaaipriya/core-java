package com.arrays;

public class Arrays2d {

	public static void main(String[] args) {
		int [][] array= new int[3][3];
		array[0][0]=20;
		array[0][1]=30;
		array[0][2]=40;
		array[1][0]=10;
		array[1][1]=20;
		array[1][2]=30;
		array[2][0]=20;
		array[2][1]=33;
		array[2][2]=22;
		for(int i=0; i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println(array[i][j]+" ");
		}
		System.out.println();
		}
		
		int[] array1=new int[] {22,54,65,77};
		System.out.println("printing original array");
		for(int i=0;i<array1.length;i++) {
				System.out.println(array1[i]);
			
		}
		System.out.println("printing arrays in reverse order");
for(int i=array1.length-1; i>0; i--) {
	System.out.println(array1[i]+" ");
	
}
int arrays[]= {33,87,66,99};
int max=arrays[0],min=arrays[0];
for(int i=0;i<arrays.length;i++) {
	if(max<arrays[i]) {
		max=arrays[i];
	}
	if(min>arrays[i]) {
		min=arrays[i];
		
		
	}
}
System.out.println("max value:"+max);
System.out.println("min value:"+min);
		
	}
	

}
