/*A abstract class "COJ_16_Cake" is given. Create a subclass called COJ_16_OrderedCake. 
And check the working of it.

Meet the following requirements.

Modifiers of the class COJ_16_Cake : abstract, public 

Attributes:
	Attribute Name : shape  Type:String  Modifier:private
	Attribute Name :flavour Type:String  Modifier:private
	Attribute Name :qty     Type:int     Modifier:private
	Attribute Name :price   Type:float   Modifier:private

Constructor:(One only)
	Modifier : protected
	type : With 3 parameters shape,flavour,qty in the same order.

Methods :
	Define setters and getters for all fields with protected Modifier/Access specifier
	
	Name of the method : showCake	
	Return Type : void
	Modifier : Protected. 
	Task : It must print data as per below format/example.
	"A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-"*/


package Inheritance;

import java.util.Scanner;

public class Cake 
{
 
	
	String shape ;
	String flavour;
	int quantity;
	float price;
	
	protected Cake(String shape,String flavour,int quantity) 
{
	this.shape=shape;
	this.flavour=flavour;
	this.quantity=quantity;
}

    public String  toString()
{
      return "Cake [shape="+ shape +",flavour="+ flavour +",quantity="+ quantity +", price=" + price +"]";
    	
}
     public String getShape() 
{
	   return shape;
}
     public void setShape(String shape) 
{
	   this.shape=shape;
}
     public String getFlavour() 
{
       return flavour;
}
     public void setFlavour(String flavour) 
{
       this .flavour=flavour;
}

     public int getQuantity() 
{
         return quantity;
}
  
     public void setQuantity(int quantity) 
{
         this.quantity = quantity;
}
  
     public float getPrice() 
{
         return price;
}
  
     public void setPrice(float price) 
{
         this.price = price;
}

      protected void showCake(String shape, String flavour, int quantity) 
{
     float Price = 800;
     
     float totalPrice = quantity*Price;
     
     System.out.println("A "+shape+" "+flavour+" "+"cake of "+quantity+"Kg/Kg's ready @ Rs"+totalPrice);
}
  
     public static void main(String[] args) 
{

         Scanner sc = new Scanner(System.in);
         
         System.out.println("enter shape ");
         
         String shape = sc.next();
         

         System.out.println("enter flavour");
         
         String flavour = sc.next();

         System.out.println("enter quantity");
         
         int quantity = sc.nextInt();

         Cake c = new Cake(shape, flavour, quantity);
         
         c.setFlavour(flavour);
         
         c.setShape(shape);
         
         c.setQuantity(quantity);
         
         System.out.println(c);
         
         c.showCake(shape, flavour, quantity);
     }
 }






