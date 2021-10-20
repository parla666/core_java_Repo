package exampel1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;

/*User needs to enter his/her name
* Show the list of sports
* Maintain the timing slots against each sport in other list.
* Once user gives input of which sport he/she wants on the next step show the sport name and available slots.*/

public class SportsList {
	static String currentUser = null;

	public static void userDetails() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ready to Book SportsComplex Slots , Please enter your name");
		currentUser = sc.nextLine();
		listOfSports();
	}

	public static void listOfSports() throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("1 = Badminton");
		al.add("2 = Football");
		al.add("3 = Box Cricket");
		System.out.println("sportsList is:");
		al.forEach((n) -> System.out.println(n));
		listOfSlots();
	}

	public static void listOfSlots() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the sport which you want from the list:");
		int sportType = sc.nextInt();

		switch (sportType) {
		case 1:
			System.out.println(" Available Slots in Badmimnton sport are:");
//			System.out.print(DataOfSlotsList.badminton.entrySet());
			for (Entry<Integer, String> m : DataOfSlotsList.badminton.entrySet()) {
				System.out.println(m.getKey() + "= " + m.getValue());
			}
			badmintonData();
			break;

		case 2:
			System.out.println("Available slots in Football sport are: ");
			for (Entry<Integer, String> m : DataOfSlotsList.football.entrySet()) {
				System.out.println(m.getKey() + "= " + m.getValue());
			}
			footballData();
			break;

		case 3:
			System.out.println("Available slots in BoxCricket sport are: ");
			for (Entry<Integer, String> m : DataOfSlotsList.boxCricket.entrySet()) {
				System.out.println(m.getKey() + "=" + m.getValue());
			}
			boxCricketData();
			break;

		default:
			System.out.println(" please select the sport :");
			listOfSports();
		}
	}

	public static void badmintonData() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Select the slot number  :");
		int Slot = sc.nextInt();
		System.out.println("Thank you, Sucessfully All0tted  your slot :" + Slot + ", timings are:"
				+ DataOfSlotsList.badminton.get(Slot));
		try {
			SportsComplex.writeXlasxData(new CustomerSlotData(currentUser, Slot, DataOfSlotsList.badminton.get(Slot)));
		} catch (IOException e) {

			e.printStackTrace();
		}
		DataOfSlotsList.badminton.remove(Slot);
		System.out.println("To continue enter 1, To get list of sports enter 2, To exit enter any key: ");
		int press = sc.nextInt();
		if (press == 1) {
			badmintonData();
		} else if (press == 2) {
			listOfSports();
		} else {
			System.out.println("Thanking you");
			userDetails();
		}
	}

	public static void footballData() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the slot number you would like to book :");
		int Slot = sc.nextInt();
		System.out.println("Thank you, Sucessfully All0tted  your slot :" + Slot + ", timings are:"
				+ DataOfSlotsList.football.get(Slot));
		SportsComplex.writeXlasxData(new CustomerSlotData(currentUser, Slot, DataOfSlotsList.football.get(Slot)));
		DataOfSlotsList.football.remove(Slot);
		System.out.println("To continue enter 1, To get list of sports enter 2, To exit enter any key:");
		int press = sc.nextInt();
		if (press == 1) {
			footballData();
		}
		if (press == 2) {
			listOfSports();
		} else {
			System.out.println("Thanking you for choosing :");
			userDetails();
		}
	}

	public static void boxCricketData() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the slot number you would like to book :");
		int Slot = sc.nextInt();
		System.out.println("Thank you, Sucessfully All0tted  your slot :" + Slot + ", timings are:"
				+ DataOfSlotsList.boxCricket.get(Slot));
		SportsComplex.writeXlasxData(new CustomerSlotData(currentUser, Slot, DataOfSlotsList.boxCricket.get(Slot)));
		DataOfSlotsList.boxCricket.remove(Slot);
		System.out.println("To continue enter 1, To get list of sports enter 2, To exit enter any key: ");
		int press = sc.nextInt();
		if (press == 1) {
			boxCricketData();
		}
		if (press == 2) {
			listOfSports();
		} else {
			System.out.println("Thanking you for choosing:");
			userDetails();
		}
	}
}
