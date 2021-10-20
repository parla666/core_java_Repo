
/*Problem statement
Create an application to book slots at a Sports complex
1. On load(execution) create data 
A. Badminton court - 10 slots each with timings against each ( 1 hour per each slot)
B. Football slots - 20 slots (30 mins for each slot)
C. Box cricket -5 slots ( 2 hours each)

2. User needs to enter his/her name
3. Show the list of sports
4. Maintain the timing slots against each sport in other list.
5. Once user gives input of which sport he/she wants on the next step show the sport name and available slots.
6. Once the user selects a slot and enters the data , show a success message with his booking details and delete the slot record from the list.
7. Then when they hit enter again ask for new user details until the data is empty / program is terminated
8.The booking details need to be store in excel file*/

package corejavatask;
import java.util.*;
import java.io.FileOutputStream;  
public class SportsComplex {

		 static Map<Integer,String> Badminton = new HashMap<Integer,String>(); 
         static HashMap<Integer,String>Football=new HashMap<Integer,String>();
         static HashMap<Integer,String>Boxcricket=new HashMap<Integer,String>();
         
        public static void main(String arg[]) {
        dataOfSports();
         data();
         sportsList();
        }
         
         public static void    dataOfSports () {
        	 
        	 Badminton.put(1,"6AM to 7AM");
        	    Badminton.put(2,"7AM to 8AM");
        	       Badminton.put(3,"8AM to 9AM");
        	           Badminton.put(4,"9AM to 10AM");
        	                Badminton.put(5,"10AM to 11AM");
        	                    Badminton.put(6,"11AM to 12PM");
              	             Badminton.put(7,"12PM to 1PM");
                       Badminton.put(8,"1PM to 2PM");
               	   Badminton.put(9,"2PM to 3PM");
                Badminton.put(10,"3PM to 4PM");
        	 
        	 Football.put(1,"8AM TO 8:30AM ");
        	     Football.put(2,"8:30AM TO 9AM ");
        	        Football.put(3,"9AM TO 9:30AM ");
        	            Football.put(4,"9:30AM TO 10AM ");
                         	 Football.put(5,"10AM TO 10:30AM ");
        	                     Football.put(6,"10:30AM TO 11AM ");
        	                            Football.put(7,"11AM TO 11:30PM ");
        	                                 Football.put(8,"11:30AM TO 12PM ");
                                            	 Football.put(9,"12PM TO 12:30PM ");   
        	                                          Football.put(10,"1PM TO 1:30PM ");
        	                                          Football.put(11,"2PM TO 2:30PM ");        	 
                                             	 Football.put(12,"2:30PM TO 3PM ");
                                        	 Football.put(13,"3PM TO 3:30PM ");
                                 	 Football.put(14,"3:30PM TO 4PM ");
                            	 Football.put(15,"4PM TO 5:30PM ");
                    	 Football.put(16,"5:30PM TO 6PM ");
             	 Football.put(17,"6:PM TO 6:30PM ");
         	 Football.put(18,"6:30PM TO 7PM ");
       	 Football.put(19,"7PM TO 7:30PM ");
   	 Football.put(20,"7:30PM TO 8PM ");
        	 
        	 Boxcricket.put(1,"9AM TO 11AM");
        	 Boxcricket.put(2,"11AM TO 1PM");
        			 Boxcricket.put(3,"1PM TO 3PM");
        					 Boxcricket.put(4,"3PM TO 5PM");
        							 Boxcricket.put(5,"5PM TO 6PM");
        									 
         }
         
         
         public static void data() {
        	 Scanner name = new Scanner(System.in);
        	 System.out.println("enter your name :");
        	 String  userName=name.nextLine();    //read user input
        	 System.out.println(" username "+ userName);
        	 sportsList();
        	 
         }
         
         public static void sportsList() {
        	 
        	 ArrayList<String> st=new  ArrayList<String>();
        	 st.add("1- Badminton");
        	 st.add("2-Football");
        	 st.add("3-Box cicket");
        	 
        	 System.out.println(" choose the sportsList :");
        	 
        	 st.forEach((n)->System.out.println(n));
        	 switchcase();
         }

         public static void switchcase() {
        	 Scanner s=new Scanner(System.in);
        	 System.out.println("Enter your choice :");
        	 int sport=s.nextInt();
        	 switch (sport) {
        	 case 1 :
        		 System.out.println(" Available Slots in Badmimnton are :");
        
         		System.out.print(Badminton.entrySet());	 
        		 Badminton();
        		 break;
        		 
        	 case 2 :
        		 System.out.println("Available slots in football are : ");
        		 System.out.print(Football.entrySet());	 
        		 Football();
        		 break;
        		
        	 case 3 :
        		 System.out.println("Available slots in Box cricket are : ");
        		 System.out.print(Boxcricket.entrySet());	 
        		 Boxcricket();
        		 break;
        	    
        		 default :
        			 System.out.println(" please select from the available SportList :");
        			 
        			 sportsList();
        			 
        	 
        	 }
        	 
        	 
         }
	public static void Badminton() {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a slot number you would like to book :");
		int Slot =s.nextInt();
		System.out.println(" Thank you, Sucessfully All0tted your slot :"+ Slot+ " .timings are :"+ Badminton.get(Slot));
	
		Badminton.remove(Slot);
		System.out.println(" click 1 for continue , click 2 for sports list, choose any key to get out( 3 to 9):   ");
		int press = s.nextInt();
		 if (press==1) {
			 Badminton();
		 }
		 if (press==2) {
			 sportsList();
			 
		 }
		 else {
			System.out.println("Thanking you for choosing :");
			data();
			
		}
		
	}
	
	public static void Football() {
		Scanner s=new Scanner(System.in);
		System.out.println("enterr a slot number you would like to book :");
		int Slot =s.nextInt();
		System.out.println(" Thank you, Sucessfully All0tted your slot : "+Slot + ", timings are :"+ Football.get(Slot));
		 Football.remove(Slot);
		 
		 
		System.out.println("  click 1 for continue , click 2 for sports list, choose any key to get out( 3 to 9):   ");
		int press = s.nextInt();
		 if (press==1) {
			 Football();
		 }
		 if (press==2) {
			 sportsList();
			 
		 }
		 else {
			System.out.println("Thanking you for choosing :");
			data();
			
		}}
		
	
	public static void Boxcricket() {
		Scanner s=new Scanner(System.in);
		System.out.println("enterr a slot number you would like to book :");
		int Slot =s.nextInt();
		System.out.println(" Thank you, Sucessfully All0tted  your slot :"+Slot +", timings are :"+Boxcricket.get(Slot));
		Boxcricket.remove(Slot);
		System.out.println("  click 1 for continue , click 2 for sports list, choose any key to get out( 3 to 9):   ");
		int press = s.nextInt();
		 if (press==1) {
			 Boxcricket();
		 }
		 if (press==2) {
			 sportsList();
			 
		 }
		 else {
			System.out.println("Thanking you for choosing :");
			data();
			
		}}
	}