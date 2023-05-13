package com.practiceprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereadinginputstreams {
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("D:\\resources.txt");
	int i=0;
	while((i=file.read())!=-1) {
		System.out.print((char)i);
	}
}
}
