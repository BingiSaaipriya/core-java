package com.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Checkedexceptiondemo2 {
	public static void main(String[] args) throws IOException {
		String messages ="what is  checked exception in java?checked exception is that ones it using the throws keyword.";
				File file = new File("msg.txt") ;
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
					byte[] bytes=messages.getBytes();
					fos.write(bytes);
					System.out.println("success");
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						System.out.println("for clean up process");
						fos.close();
					} catch (IOException e) {
				e.printStackTrace();
					}
				}
}
}
