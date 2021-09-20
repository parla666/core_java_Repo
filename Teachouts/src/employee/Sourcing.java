/*Class COJ_14_Sourcing
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double*/

package employee;

public class Sourcing
{
int id=101;
String name="java";
double basicSalary=10000;
double HRAPer=99;
double DAPer =77;
int enrollmentTarget=32;
int enrollmentReached=23;
double perkPerEnrollment=9;
public double calculate()
{
 double calculatGrossSalary=basicSalary+HRAPer+DAPer+enrollmentTarget+enrollmentReached+perkPerEnrollment;
 

return calculatGrossSalary;
}
   public static void main (String[] args)
{
	   Sourcing s= new Sourcing ();
	System.out.println(s.calculate());

}
}
   
