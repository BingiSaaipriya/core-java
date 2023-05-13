package com.practiceprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputsstream {
	public static void main(String[] args) throws IOException  {
		FileOutputStream fos = null;
		try{
			fos=new FileOutputStream("D:\\resources.txt");
			String S ="here is the programming language";
			fos.write(S.getBytes());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		System.out.println(e.getMessage());
		}finally {
			System.out.println("clean");
			if(fos!=null)
				fos.close();
		}

}
}
