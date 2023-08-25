package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.setsprograms.Student;

public class EmployeeTest {
	public static void main(String[] args) {
Set<Employee> set = new HashSet<>();
set.add(new Employee(1, "saipriya", 2000.00));
set.add(new Employee(2, "sahithi", 30000.00));
set.add(new Employee(3, "thriveni", 2000.00));
set.add(new Employee(4, "usha", 14000.00));
set.add(new Employee(5, "latha", 22000.00));
Map<String, Set<Employee>> rrr = new HashMap<>();
rrr.put("Emp", set);


Iterator<Entry<String, Set<Employee>>> itr= rrr.entrySet().iterator();
while(itr.hasNext()) {
Entry<String, Set<Employee>>  next= itr.next();
//String pp= next.getKey();
Set<Employee> value =next.getValue();
for (Employee pp : value) {
	if(pp.getsalary()>= 10000.00) {
		System.out.println(pp);
	
}
	
}


//SSystem.out.println(next);


}
	
	}
	

}
