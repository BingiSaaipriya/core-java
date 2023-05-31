package com.serialiationIsa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Studenttest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student student = new Student(12, "arha", "sri", 6, "arha213@gmal.com"," 23454", "python");
		try(FileOutputStream fos = new FileOutputStream("student.ser");){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			System.out.println("sucess!!!!!");
		}catch (FileNotFoundException e) {
e.printStackTrace();
		
		}catch(IOException ee) {
			ee.printStackTrace();
		}
		
		
		try(FileInputStream fis = new FileInputStream("student.ser");){
			ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu= (Student) ois.readObject();
		System.out.println(stu);
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		}catch (IOException e1) {
		e1.printStackTrace();
		}catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
				
	}

}
