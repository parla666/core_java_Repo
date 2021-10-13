package exampelsJava;

 //interface
interface Animal {
	  public void animalSound(); 
	  
	  // interface method (does not have a body)
	  
	  public void sleep(); 
	  
	  // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	class Pig implements Animal {
	  public void animalSound() {
	    
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	   
	    System.out.println("Zzz");
	  }
	}

	class MyMainClass {
	  public static void main(String[] args) {
	    Pig myPig = new Pig();      // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}


