/*question 2:
parking slots
1. there are two basements b1 and b2 both contains 30 slots
2. b1 for bikes and b2 for cars
3. allocate a vehicles with slots and generate a receipt and don't allocate a single slot for two vehicles
4. and store the data in a file*/




package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ParkingSlots1 
{
	static int vNumber;
	static String vType;

	public ParkingSlots1(int vNumber, String vType) 
	{
		this.vNumber = vNumber;
		this.vType = vType;
	}

	public static void main(String[] args) 
	{

		ParkingSlots1 ps = new ParkingSlots1(vNumber, vType);

		LinkedHashMap<Integer, String> b1 = new LinkedHashMap<Integer, String>();
		LinkedHashMap<Integer, String> b2 = new LinkedHashMap<Integer, String>();	
		
		for(int i=1; i<=60; i++) 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle type b1 for 2-wheeler OR b2 for 4-wheeler");
		String vType = sc.next();
		
			if (vType.equalsIgnoreCase("b1"))
			{
				if (b1.size()<30) 
				{
					int key = i;
					System.out.println("enter the vehicle number");
					String vNumber = sc.next();
					b1.put(key, vNumber);
					System.out.println("Slot number is:" + i + " " + "Your vehicle number is:" + b1.get(i));

					Set<Entry<Integer, String>> keys = b1.entrySet();
					Iterator itr = keys.iterator();
					System.out.println("Your parking details are:");
					while (itr.hasNext()) 
					{
						System.out.println(itr.next());
					}
					if (keys.size()==30) 
					{
						System.out.println("Parking slots are not available in b1");
					}
				}

			} 
		else if (vType.equalsIgnoreCase("b2"))
				{
				if(b2.size()<30)
					{
						int key = i;
						System.out.println("enter the vehicle number");
						String vNumber = sc.next();
						b2.put(key, vNumber);
						System.out.println("Slot number is:" + i + " " + "Your vehicle number is:" + b2.get(i));
	
						Set<Entry<Integer, String>> keys = b2.entrySet();
						Iterator itr = keys.iterator();
						System.out.println("Your parking details are:");
						while (itr.hasNext()) 
						{
							System.out.println(itr.next());
						}
							if (keys.size()==30) 
							{
								System.out.println("Parking slots are not available in b2");
							}
					}

				} 

			
		}
	}
}
