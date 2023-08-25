

public class Cusomerdetails {
  
	int id;
	String firstname;
	String lastname;
static   String address="ramagundam";
 static  long phonenum=8750887651l;
 //static
	//System.out.println("address:"+address);
  //}
	 
 
 
 
 public String getlastName(String lastName) {
	 return this.lastname=lastName;
 }
 
 public void displaycustomerdetails() {
	   System.out.println("customeid:"+id);
	   System.out.println("customer firstname:"+firstname);
	     System.out.println("customer lastname:"+lastname);
	   System.out.println("customer address:"+address);
	   System.out.println("customer phonenum:"+phonenum);
		
		
  }
  public static void main(String ags[] ) {
   Cusomerdetails details=new Cusomerdetails();
   details.id=1;
   details.firstname="sai";
  // details.lastname="arha";
   System.out.println(details.getlastName("arha"));
   details.displaycustomerdetails();
   
   
   
   details.id=2;
   details.firstname="arha";
  details.lastname="sri";
   details.displaycustomerdetails();
   
   
   



	  
	  
	  
	  
	  
  }
}


