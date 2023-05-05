package com.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.BYTE_ARRAY;

public class Checkedexceptiondemo {
	public static void main(String[] args) throws IOException {
		String messages ="what is  checked exception in java?checked exception is that ones it using the throws keyword.";
				File file = new File("message.txt") ;
				FileOutputStream fos = new FileOutputStream(file);
			byte[] bytes=messages.getBytes();
				fos.write(bytes);
				fos.close();
	}

}
