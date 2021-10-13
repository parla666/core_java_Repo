/*Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: Create with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer)*/

package Inheritance;

import java.util.Scanner;

public class Constroctor {
	 
		int id;
	           String name;
		double basicSalary;
		double HRAPer;
		double DAPer;


		  Constroctor(int id, String name, double basicSalary, double HRAPer, double DAPer) 
		{

			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			this.HRAPer = HRAPer;
			this.DAPer = DAPer; 

		}



		public double calculateGrossSalary(Constroctor e) //method
		{
			double toatl=e.basicSalary+ e.HRAPer+ e.DAPer;
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


			Constroctor e= new Constroctor(id, name, basicSalary, HRAPer, DAPer);

			double total =e.calculateGrossSalary(e);
			System.out.println(total);
		}


 

	}


