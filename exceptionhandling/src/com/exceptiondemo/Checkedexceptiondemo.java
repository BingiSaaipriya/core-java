package com.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.BYTE_ARRAY;

public class Checkedexceptiondemo {
	public static void main(String[] args) throws FileNotFoundException {
		String messages ="what is  checked exception in java?checked exception is that ones it using the throws keyword.";
				File file = new File("priya.txt") ;
				
					FileOutputStream fos = new FileOutputStream(file);
				
			byte[] bytes=messages.getBytes();
				try {
					fos.write(bytes);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}

}
