package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readingfiledemo2 {
		static final String path="D:\\Workspace\\exceptionhandling\\";
		public static void main(String[] args)  {
	File file = new File(path+"message.txt");
	FileInputStream fis =null;
	try {
		fis= new FileInputStream(file);
		int i=0;
		while((i=fis.read())!=-1) {
		System.out.print((char)i);
		}
		System.out.println("sucess");
		fis.close();
	}catch(FileNotFoundException fe) {
		//fe.printStackTrace();
		System.out.println(fe.getMessage());
		System.out.println(fe.getStackTrace());
		System.out.println(fe.getCause());
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(fis!=null) {
					
					System.out.println("clean up activities");
				}
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

