/*Class COJ_15_Employee
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer*/


package Inheritance;

import java.util.Scanner;

public class Employee
{
    


    int id;
    String name;
    double basicSalary;
    double HRAPer;
    double DAPer;

 

    public Employee()  //constructor
    {
        
    }
    public Employee(int id, String name, double basicSalary, double HRAPer, double DAPer) { //Parameterized constructor
        
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer; //variables
    }

 

    public double calculateGrossSalary(Employee e) //method
    {
        double toatl=e.basicSalary+ e.HRAPer+ e.DAPer;
        return toatl;
}
    
    public void main(String[] args) { //main method
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
        
        
        Employee e= new Employee(id, name, basicSalary, HRAPer, DAPer);
        
        double total =e.calculateGrossSalary(e);
        System.out.println(total);
    }

 

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
                + ", DAPer=" + DAPer + "]";
    };
    }
 




    