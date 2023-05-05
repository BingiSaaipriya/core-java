
package accessmodifiers;

public class Employee {
	int id;
	 String name;
	 double salary;
	
	 public Employee(){
		System.out.println("employee data");
	}
	
	protected  Employee(int id,String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public void display(){
	System.out.println(getId());
		System.out.println(getName());
		System.out.println(getSalary());
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	
		
	}
	}