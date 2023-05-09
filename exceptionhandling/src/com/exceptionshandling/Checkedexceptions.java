package com.exceptionshandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Checkedexceptions {
	public static void main(String[] args) throws IOException {
		String message="what is string?String is a sequence of characters";
		File file = new File("message.txt");
		FileOutputStream fos = new FileOutputStream(file);
		byte[] bytes =message.getBytes();
		fos.write(bytes);
		fos.close();
		
	}

}
