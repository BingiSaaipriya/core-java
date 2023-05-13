package com.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readerdemo {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("D:\\writer.txt");){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}}


