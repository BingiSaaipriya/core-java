package com.IOstreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOuputStream {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
		dos.writeInt(20);
		dos.writeByte(123);
		dos.writeBoolean(true);
		dos.writeDouble(20.00);
		dos.writeUTF("hello it is a output stream");
        dos.writeFloat(10.2f);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		int a= dis.readInt();
		System.out.println(a);
		double d = dis.readDouble();
		System.out.println(d);
		String msg = dis.readLine();
		System.out.println(msg);
	}

	
}
