package com.file;

import java.io.File;
import java.io.IOException;

public class Filedemo {
	public static void main(String[] args) throws IOException {
		File f = new File("./Resource/");
		System.out.println(f.mkdir());
//		System.out.println(f.isHidden());
//		System.out.println(f.canWrite());
//		f.setWritable(true);
//		System.out.println(f.canWrite());
//		if(f.exists()) 
//		f.delete();
//	 System.out.println((f.createNewFile()));
//			
		//System.out.println(f.exists());
		//System.out.println(f.delete());
		//System.out.println(f.createNewFile());
	}

}
