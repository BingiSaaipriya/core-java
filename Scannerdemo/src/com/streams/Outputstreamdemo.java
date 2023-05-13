package com.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outputstreamdemo {
	public static void main(String[] args) throws IOException {
	//closing the resources using finally block\\
//		FileOutputStream fos=null;
//		try {
//		 fos = new FileOutputStream("D:\\test.txt");
//		String msg ="this is a file outputstram";
//		fos.write(msg.getBytes());
//		System.out.println("sucess");
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//		}finally {
//			System.out.println("close the resources");
//		if(fos!=null)
//		fos.close();
//		}
//	}
		 // close the resources using with try resources\\
		try(FileOutputStream fos= new FileOutputStream("D:\\test.txt");) {
		String msg ="this is a file outputstram";
		fos.write(msg.getBytes());
		System.out.println("sucess");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
}
}
