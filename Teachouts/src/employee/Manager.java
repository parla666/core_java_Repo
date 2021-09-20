/*Class COJ_14_Manager
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance*/
package employee;

public class Manager {
int id =666;
String name="Paruchuri";
double basicSalary=90;
double HRAPer=6;
double DAPer=60;
double projectAllowance=9;
public double calculate()
{
 double calculatGrossSalary=basicSalary+HRAPer+DAPer+projectAllowance;
 

return calculatGrossSalary;
}
   public static void main (String[] args)
{
	Manager m= new Manager();
	System.out.println(m.calculate());
}
	




}
