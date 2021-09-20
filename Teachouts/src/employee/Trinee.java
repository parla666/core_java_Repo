/*Class COJ_14_Trainer
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)*/

package employee;

public class Trinee 
{
	int id =99;
	String name="Prasanth";
	double basicSalary=80;
	double HRAPer=54;
	double DAPer=9860;
	int batchCount=5;
	double perkPerBatch=7;
	public double calculate()
	{
	 double calculatGrossSalary=basicSalary+HRAPer+DAPer+perkPerBatch;
	 

	return calculatGrossSalary;
	}
	   public static void main (String[] args)
{
		   Trinee t= new Trinee();
		System.out.println(t.calculate());
	}
		




	}

