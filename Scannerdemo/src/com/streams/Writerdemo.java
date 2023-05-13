package com.streams;

import java.io.FileWriter;
import java.io.IOException;

public class Writerdemo {
	public static void main(String[] args) throws IOException {
		try(FileWriter fw = new FileWriter("D:\\writer.txt");){
			fw.write("welcome all");
			System.out.println("sucess!!");
		}catch(IOException a) {
			System.out.println(a.getMessage());
		}
	}

}
