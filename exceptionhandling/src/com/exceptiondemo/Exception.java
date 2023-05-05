package com.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exception {
	public static void main(String[] args) throws IOException {
		String messages = "what is methodoverloading?method name should be same but passing different types of parameters.";
File file =new File("msg.txt");
FileOutputStream fos = new FileOutputStream(file);
byte[] bytes = messages.getBytes();
fos.write(bytes);


	}

}
