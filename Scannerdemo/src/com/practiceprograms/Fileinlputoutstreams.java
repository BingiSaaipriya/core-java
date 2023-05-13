package com.practiceprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinlputoutstreams {
	private static final String path="D:\\";
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee em1 = new Employee(2,"shyam",50000.00);
		File file = new File(path+"lalitha.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		try(FileOutputStream fos = new FileOutputStream(file)){
			byte[] bytes = em1.toString().getBytes();
			fos.write(bytes);
		}catch (Exception e) {
			System.out.println("ldkjg");
		}
	
		try(FileInputStream fis = new FileInputStream(file)){
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		}
		}
	}


