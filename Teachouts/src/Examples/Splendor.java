package Examples;
class Splendor extends Bike1{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike1 b = new Splendor();//upcasting  
    b.run();  
  }  
}  