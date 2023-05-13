package com.practiceprograms;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	
	//writer the data into the character
	
	public static void main(String[] args) throws IOException {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write("welcome to file writer class demo");
			System.out.println("success!!!!");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
