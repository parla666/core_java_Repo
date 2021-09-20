/*Class COJ_14_Employee
Fields: id: int, name : String, basicSalary : double, HRAPer : double, DAPer : double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer*/

package employee;

public class Employee
{
 int id =70309;
 String name = "prasad";
 double basicSalary =12000;
 double HRAPer = 4000;
 double DAPer = 200;
 
 public double calculate()
 {
  double calculatGrossSalary=basicSalary+HRAPer+DAPer;
  
 
return calculatGrossSalary;
}
    public static void main (String[] args)
{
	Employee e = new Employee();
	System.out.println(e.calculate());
	
}
}
