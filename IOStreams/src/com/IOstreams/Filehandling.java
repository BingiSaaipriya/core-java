package com.IOstreams;

import java.io.File;
import java.io.IOException;

public class Filehandling {
	public static void main(String[] args) throws IOException {
		File file = new File("//resources.txt//test//");
		//System.out.println(file.mkdirs());
		//System.out.println(file.mkdir());
		if(file.exists());
		file.delete();
		System.out.println(file.createNewFile());
//		System.out.println(file.exists());
//		System.out.println(file.createNewFile());
//		System.out.println(file.isHidden());
//		System.out.println(file.canWrite());
//		file.setWritable(true);
//		System.out.println(file.canWrite());
//		System.out.println(file.exists());
//		System.out.println(file.delete());
//		System.out.println(file.createNewFile());
	}

}
