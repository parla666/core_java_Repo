package exampelsJava;

public class TestEncapsulation {  
public static void main(String[] args) {  
    //creating instance of Account class  
    Account acc=new Account();  
    //setting values through setter methods  
    acc.setAcc_no(913395642);  
    acc.setName("parla venkata siva prasad");  
    acc.setEmail("venkataprasad.parla666@gmail.com");  
    acc.setAmount(500000f);  
    //getting values through getter methods  
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  
