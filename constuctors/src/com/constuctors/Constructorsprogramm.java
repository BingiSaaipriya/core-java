package com.constuctors;

public class Constructorsprogramm {
  
	int  id;
	String name;
	double salary;
	String email;
	//ethics.... in the organizations
	 static {
		 System.out.println("1.Always be a kind");
		 System.out.println("2.Help each other");
		 System.out.println("3.learn from mistakes");
		}
	 
	 public Constructorsprogramm() {
		 
	 }
	 
	
	
	public  Constructorsprogramm(int id,String name,double ss ,String eee) {
		this.id=id;
		this.name=name;
		salary=ss;
		email=eee;
	}
	

	
	public  Constructorsprogramm(int eid,String ename) {
	System.out.println("parametersized constructor");
	id=eid;
	name=ename;
	}
	
	public  Constructorsprogramm(int eid) {
		System.out.println("parametersized constructor");
		id=eid;
		
	}
		
		
		public  Constructorsprogramm(String ename) {
			System.out.println("parametersized constructor");
			name=ename;
		}
	
		
		public void display() {
			System.out.println("employee id:"+id);
			System.out.println("employee name:"+name);
			System.out.println("employee salary:"+salary);
			System.out.println( "employee email:"+email);
			
		}
		//methods
		
		public int getid1() {
			return this.id;
		}
		
		public String getName() {
			return this.name;
		
		}



			public double getsalary() {
				return this.salary;
			}
				
				public String getemail() {
					return this.email;
			}
		
		public static void main (String args[]) {
			Constructorsprogramm cc=new Constructorsprogramm();
		cc.id=1;
		cc.name="priya";
			//cc.display();
			System.out.println("employee id:"+cc.getid1());
		System.out.println("employee id:"+cc.getName());
	Constructorsprogramm cc2=new Constructorsprogramm(2,"priya",23000.00,"saipriya444@gmail.com");
		cc2.display();
		
		Constructorsprogramm cc3=new Constructorsprogramm(121,"sss");
		cc3.display();

			Constructorsprogramm[] Constructor= {cc,cc2};
			for(int i=0;i<Constructor.length;i++) {
				Constructor[i].display();
			}
			
			//enchanced loop
			for(Constructorsprogramm constructors:Constructor)
				constructors.display();
				
					
			
			
			
			Constructorsprogramm pp=new Constructorsprogramm (1, "priya", 12000.00,"priya8100@email.com");
		pp.display();
		Constructorsprogramm pp1=new Constructorsprogramm (2, "arha", 15000.00,"arha@email.com");
		pp1.display();
		Constructorsprogramm pp2=new Constructorsprogramm (3, "arhasri", 14000.00,"arhasri@email.com");
		pp2.display();
	
		
	}

}
