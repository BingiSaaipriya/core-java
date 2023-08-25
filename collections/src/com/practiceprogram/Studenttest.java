package com.practiceprogram;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class Studenttest {
	private static final String Courseofjava = null;

	public static void main(String[] args) throws ParseException {
		Course c1 = new Course(1, "python", 45);
		Course c2 = new Course(5, "javascript", 60);
		Course c3 = new Course(3, "testing", 120);
		Course c4 = new Course(4, "java regular course", 30);
		Course c5 = new Course(2, "Angular", 77);
		Course c6 = new Course(6, "corejava", 99);
		
		List<Course> courseofpython = new ArrayList<>();
		courseofpython.add(c1);
		courseofpython.add(c4);
		List<Course> courseofjava= new ArrayList<>();
		courseofjava.add(c2);
		courseofjava.add(c6);
		List<Course> courseoftesting= new ArrayList<>();
		courseoftesting.add(c3);
		courseoftesting.add(c5);
		// mm/dd/yyyy
				// dd/mm/yyyy
				String dob1 = "12/03/1990";
				String dob2 = "12/03/1980";
				String dob3 = "12/03/1993";
				String dob4 = "12/03/1994";
				String dob5 = "12/03/199";
				SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("mm/dd/yyyy");
				Date date1 = simpleDateFormatter.parse(dob1);
				Date date2 = simpleDateFormatter.parse(dob2);
				Date date3 = simpleDateFormatter.parse(dob3);
				Date date4 = simpleDateFormatter.parse(dob5);
				Date date5 = simpleDateFormatter.parse(dob4);
				
				
				Student s1 = new Student(2, "sai", date5, courseoftesting);
				Student s2 = new Student(1, "priya", date3, courseofjava);
				Student s3 = new Student(3, "sahithi", date1, courseoftesting);
				Student s4 = new Student(4, "honey", date4, courseofpython);
				Student s5 = new Student(5, "chinna", date2, courseofjava);
				//Student s6 = new Student(6, "ram", date6, courseofpython);
				
				
				Map<Student, LocalDate> studentsmap = new HashMap<Student, LocalDate>();
				LocalDate joingDate = LocalDate.of(2023, 05, 10);
				LocalDate joingDate2= LocalDate.of(2023, 05, 11);
				//studentsmap.put(s6, joingDate);
				studentsmap.put(s5, joingDate2);
				studentsmap.put(s1, joingDate);
				studentsmap.put(s4, joingDate);
				studentsmap.put(s2, joingDate2);
				studentsmap.put(s3, joingDate2);
				
		for (Map.Entry<Student, LocalDate> entry:studentsmap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("*************************");
		
	Map<Student, LocalDate> studentmap2= new TreeMap<Student,LocalDate>(new Studentnamecomparator());
	studentmap2.put(s5, joingDate2);
	studentmap2.put(s1, joingDate);
	studentmap2.put(s4, joingDate);
	studentmap2.put(s2, joingDate2);
	studentmap2.put(s3, joingDate2);
	for (Map.Entry<Student, LocalDate> entry:studentmap2.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
			
				
				
				
	}			
				
	}


