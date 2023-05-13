package com.bufferedobjectsfile;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args)  {
		try {
			FileOutputStream fos = new FileOutputStream("employeefile.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			Address a1 =new Address("ts",505367);
			Employee employee = new Employee(1, "priya", 30000.00,a1);
			Employee employee2 = new Employee(2, "arha", 10000.00,new Address("mh", 826389));
			Employee[] e = {employee,employee2};
			for (Employee emp : e) {
				byte[] bytes =emp.toString().getBytes();
				bos.write(bytes);
			}
			bos.close();
					} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
		
		
	}


