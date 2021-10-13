package exampelsJava;

interface parla{  
float rateOfInterest();  
}  
class prasad implements parla{  
public float rateOfInterest(){return 11.9f;}  
}  
class siva implements parla{  
public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
public static void main(String[] args){  
parla b=new prasad();  
System.out.println("ROI: "+b.rateOfInterest());  
}}  
