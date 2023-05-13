package com.practiceprograms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.streams.Employee;

public class Bufferedoutputstream {
	private static final String path="D:\\";
	public static void main(String[] args) throws  IOException {
	Employee employee = new Employee(1,"arha",40000.00);
	
	File file = new File(path+"employees.txt");
	System.out.println(file.getAbsolutePath());
	System.out.println(file.getName());
	try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))){
		byte[] bytes = employee.toString().getBytes();
		bos.write(bytes);
				
	}catch (Exception e) {
		e.printStackTrace();
	}

	try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
		int i=0;
		while((i=bis.read())!=-1){
			System.out.print((char)i);
			
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
