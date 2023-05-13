package com.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereadinginputstream {
	public static void main(String[] args) throws IOException   {
		FileInputStream fis = new FileInputStream("D:\\createiq.txt");
		
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.println((char)i);
			
		}
  

			fis.close();
		}
	}
	