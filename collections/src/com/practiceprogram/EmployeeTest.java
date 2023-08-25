package com.practiceprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeTest {
	public static void main(String[] args) {
		Department depthr = new Department(101,"hr" , "hyd");
		Department deptit = new Department(102,"It" , "ban");
		Department depthr2 = new Department(103,"hr2" , "chennai");
		Department deptit2 = new Department(104,"It2" , "mumbai");
		
		Employee admin = new Employee(11, "chinna", 120000.00, deptit);
		Employee lead = new Employee(12, "harsha", 120000.00, deptit);
		Employee manager = new Employee(13, "revi", 120000.00, deptit);
		Employee developer = new Employee(14, "prasad", 120000.00, deptit);
		Employee sd = new Employee(11, "anand", 120000.00, deptit);
		Employee recruiter = new Employee(13, "rakesh", 120000.00, depthr);
		Employee hr = new Employee(14, "sai", 660000.00, depthr);
		Employee recruiter2 = new Employee(12, "sahithi", 850000.00, depthr2);
		Employee hr2 = new Employee(17, "thriveni", 100000.00, depthr2);
		Employee developer2 = new Employee(10, "spoorthi", 110000.00, deptit2);
		Employee developer3 = new Employee(17, "dhoni", 110000.00, deptit2);
		Employee sd2 = new Employee(19, "chickky", 220000.00, deptit);
		
		//System.out.println(admin);
		Map<Employee, String> employees = new HashMap<>();
		employees.put(admin,"from ban");
		employees.put(lead,"from ban");
		employees.put(manager,"from ban");
		employees.put(developer,"from ban");
		employees.put(sd,"from ban");
		employees.put(recruiter,"from hyd ");
		employees.put(hr,"from hyd");
		employees.put(recruiter2,"from chennai");
		employees.put(hr2,"from chennai");
		employees.put(developer2,"from  mumbai");
		employees.put(developer3,"from mumbai");
		employees.put(sd,"from ban");
		
		List<Employee> employee = new ArrayList<>();
		employee.add(manager);
		employee.add(admin);
		employee.add(developer);
		employee.add(lead);
		employee.add(sd);
		List<Employee> recr = new ArrayList<>();
		recr.add(recruiter);
		recr.add(recruiter2);
		List<Employee> hrs = new ArrayList<>();
		hrs.add(hr);
		hrs.add(hr2);
		List<Employee> devs = new ArrayList<>();
		devs.add(developer2);
		devs.add(developer3);
		devs.add(sd2);
		Map<Integer, List<Employee>> employee2 = new HashMap<>();
		employee2.put(1, employee);
		employee2.put(2, recr);
		employee2.put(3, hrs);
		employee2.put(4, devs);
//for(Map.Entry<Integer, List<Employee>> ref:employee2.entrySet()) {
//	List<Employee> name= ref.getValue();
//	for (Employee employee21 : name) {
//		if(employee21.getename().startsWith("a")||employee21.getename().endsWith("a")) {
//			System.out.println(employee21);
//		
			
			Iterator<Map.Entry<Integer, List<Employee>>> reff=employee2.entrySet().iterator();
			while(reff.hasNext()) {
				Entry<Integer, List<Employee>> next = reff.next();
				if(next.getKey()==3) {
					System.out.println(next.getKey()+"="+next.getValue());
				}
			}
			
	}
	

		
		
	}


