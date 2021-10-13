
/* 1. Provide an interface Company with
default method of return type double calculating the profit(CP-SP)
static method of return type String which takes (double) input from previous method and returns company name.
Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.*/

package Java8Task;

interface Company 
{
	public String getCompDetails(double profit,String name);//abstract mthod
	
	default double calculatingProfit() 
	{
		
		double cp = 37000.00d;
		double sp = 49000.00d;
		double profit = (sp - cp);
		return profit;

	}
}

	public class CompanyDetails {
		
	
	 static String  nameOfCompany(String name) 
	 {
		   name=name;
		   return name;

		}

 public static void main(String arg[])
 {
 Company c=(profit,name)->{ return "profit:"+ profit+"  ,  "+ name; };
 System.out.print(c.getCompDetails(c.calculatingProfit(), nameOfCompany("  balaji")));
 
 }
 }
