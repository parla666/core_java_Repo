package exampel1;

import java.util.LinkedHashMap;
//A. Badminton court - 10 slots each with timings against each ( 1 hour per each slot)

public class DataOfSlotsList {
	public static LinkedHashMap<Integer, String> badminton = new LinkedHashMap<Integer, String>();
	public static LinkedHashMap<Integer, String> football = new LinkedHashMap<Integer, String>();
	public static LinkedHashMap<Integer, String> boxCricket = new LinkedHashMap<Integer, String>();

	public static void slotsListOfSports() {
		badminton.put(1, "8AM to 9AM");
		badminton.put(2, "9AM to 10AM");
		badminton.put(3, "10AM to 11AM");
		badminton.put(4, "11AM to 12AM");
		badminton.put(5, "12PM to 1PM");
		badminton.put(6, "1PM to 2PM");
		badminton.put(7, "2PM to 3PM");
		badminton.put(8, "3PM to 4PM");
		badminton.put(9, "4PM to 5PM");
		badminton.put(10, "5PM to 6PM");

		football.put(1, "7AM TO 7:30AM ");
		football.put(2, "7:30AM TO 8AM ");
		football.put(3, "8AM TO 8:30AM ");
		football.put(4, "8:30AM TO 9AM ");
		football.put(5, "9AM TO 9:30AM ");
		football.put(6, "9:30AM TO 10AM ");
		football.put(7, "10AM TO 10:30PM ");
		football.put(8, "10:30AM TO 11PM ");
		football.put(9, "11PM TO 11:30PM ");
		football.put(10, "11:30PM TO 12PM ");
		football.put(11, "12PM TO 12:30PM ");
		football.put(12, "12:30PM TO 1PM ");
		football.put(13, "1PM TO 1:30PM ");
		football.put(14, "1:30PM TO 2PM ");
		football.put(15, "2PM TO 2:30PM ");
		football.put(16, "2:30PM TO 3PM ");
		football.put(17, "3PM TO 3:30PM ");
		football.put(18, "3:30PM TO 4PM ");
		football.put(19, "4PM TO 4:30PM ");
		football.put(20, "4:30PM TO 5PM ");

		boxCricket.put(1, "9AM TO 11AM");
		boxCricket.put(2, "11AM TO 1PM");
		boxCricket.put(3, "1PM TO 3PM");
		boxCricket.put(4, "3PM TO 5PM");
		boxCricket.put(5, "5PM TO 7PM");

	}

}
