package com.exceptionhandling;

import java.io.File;

public class Filedemo {
	static final String  PATH="D:\\Workspace\\accessmodifiers";
	public static void main(String[] args) {
		File file = new File(PATH);
		String[] listoffiles = file.list();
		for (String filename: listoffiles) {
			System.out.println(filename);
			
		}
		
	}

}
