package com.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Employeefilereadingoutstream {
	private static final String  path="D:\\";
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee(1,"arha",30000.00);
		File file = new File(path+"employee.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
	try(FileOutputStream fos = new FileOutputStream(file);){
	
		byte[] bytes = employee.toString().getBytes();
		fos.write(bytes);
	}catch (Exception e) {
		e.printStackTrace();
	}
	try(FileInputStream fis = new FileInputStream(file);){	
	int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
	}catch (Exception e) {
		e.printStackTrace();
		}
	

}

}

