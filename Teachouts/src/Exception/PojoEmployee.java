/*WAP on custom exception where it gives an 'Invalid Employee ID' Exception while entering into an Organization or office . 

Create a pojo class that contains Employee details including name ,id ,address .If ID is not found must give exception mesaage that "given Employee ID is not found or mismatched ,

 please enter the valid ID" and if ID is found give message as "Welcome to office". Take input from user and check the ID with the already existing Employee ids

Note; Please add multiple employee details*/




package Exception;

import employee.Employee;

public class PojoEmployee extends Employee {
	int id; 
	String name;
    String adress;


   public String getName()
   {  
      return name;  
}  
   public void setName(String name)
   {  
      this.name = name;  
}  
   public int getId() 
   {  
      return id;  
}  
   public void setId(int id)
   {  
      this.id = id;  
}
   public String getadress() 
   {
   return adress;
}
   public void setadress(String adress) 
   {
   this.adress=adress;
   
   
   }
   
}