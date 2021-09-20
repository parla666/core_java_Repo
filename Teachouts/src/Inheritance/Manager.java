/*Class COJ_15_Manager
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance*/

package Inheritance;

import java.util.Scanner;

public class Manager 
{

	 int id;
	    String name;
	    double basicSalary;
	    double HRAPer;
	    double DAPer;
        double projectAllowance;
	 

	    public Manager()  //constructor
	    {
	        
	    }
	    public Manager(int id, String name, double basicSalary, double HRAPer, double DAPer,double projectAllowance) { //Parameterized constructor
	        
	        this.id = id;
	        this.name = name;
	        this.basicSalary = basicSalary;
	        this.HRAPer = HRAPer;
	        this.DAPer = DAPer; 
	        this. projectAllowance = projectAllowance; //variables
	    }
	 

	    public double calculateGrossSalary(Manager m) //method
	    {
	        double toatl=m.basicSalary+ m.HRAPer+ m.DAPer;
	        return toatl;
	}
	    
	    public static void main(String[] args) { //main method
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter ID");
	        int id = sc.nextInt();
	        
	        System.out.println("enter name");
	        String name = sc.next();
	        
	        System.out.println("enter basicSalary");
	        double basicSalary = sc.nextDouble();
	        
	        System.out.println("enter HRAPer");
	        double HRAPer = sc.nextDouble();
	        
	        System.out.println("enter DAPer");
	        double DAPer = sc.nextDouble();
	        
	        System.out.println("enter projectAllowance");
	        double projectAllowance =sc.nextDouble();
	        Manager m= new Manager(id, name, basicSalary, HRAPer, DAPer ,projectAllowance);
	        
	        double total =m.calculateGrossSalary(m);
	        System.out.println(total);
	    }

	 

	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
	                + ", DAPer=" + DAPer +",projectAllowance="+ projectAllowance+"]";
	    };
	    }



