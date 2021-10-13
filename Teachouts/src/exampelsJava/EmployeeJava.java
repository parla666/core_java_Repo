package exampelsJava;

public class EmployeeJava {
	int id;
	String name,city,state;
	Address address; 
	
	  
	  
	public EmployeeJava(int id, String name, String city, String state, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.address = address;
	}

	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("prasad","hyd","india");  
		Address  address2=new Address("parla","tpt","india");  
	  
	EmployeeJava e=new EmployeeJava (5,"prasad","hyd","telangana",address1);  

	      
	e.display();  
  
	      
	}  
	}  


