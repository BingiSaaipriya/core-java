package com.practiceprograms;

import java.io.FileInputStream;

public class FileInputstream {

	public static void main(String[] args) {
try {
		FileInputStream fis = new FileInputStream("D:\\String.txt");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
}catch (Exception e) {
		e.printStackTrace();
		
		
		 

	}

}
	
}
