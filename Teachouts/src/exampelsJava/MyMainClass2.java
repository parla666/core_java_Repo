package exampelsJava;

interface FirstInterface {
	  public void myMethod(); // interface method
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	// DemoClass "implements" FirstInterface and SecondInterface
	
	
	
	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("prasad explains.....");
	  }
	 
	  public void myOtherMethod() {
	    System.out.println("prasad explains some others.....");
	  }
	}

	
	class MyMainClass2 {
	  public static void main(String[] args) {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }
	}
