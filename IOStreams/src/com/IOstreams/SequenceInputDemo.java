package com.IOstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("data.txt");
		FileInputStream fis2 = new FileInputStream("resources.txt");
		
		SequenceInputStream si = new SequenceInputStream(fis1, fis2);
		int i=0;
		while((i=si.read())!=-1) {
			System.out.print((char)i);
		}

}
}
