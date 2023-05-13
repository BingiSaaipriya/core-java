package com.practiceprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileOutputstream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		try {
			fos= new FileOutputStream("D:\\shyam.txt");
			String s="hii everyone how are you doing";
			fos.write(s.getBytes());
			if(fos!=null);
		}catch (FileNotFoundException e) {
			System.out.println("cleaning ");
			e.printStackTrace();
		}
		
		
	}

}
