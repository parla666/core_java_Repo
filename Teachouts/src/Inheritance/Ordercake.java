/*Create an inherited class "COJ_16_OrderedCake". Inherit this from "COJ_16_Cake"
Define the following for the "COJ_16_OrderedCake" class

Attributes:
	Attribute name : message
	Type	 : String
	Modifier :private

Constructors:(3 only)
	Default Constructor : Ensure shape is Round, flavour is Venilla
		and qty is 1 kg and price is 400.
	Parameterized public Constructor :  For shape,flavour,qty
	Parameterized public Constructor :  For shape,flavour,qty and message.	
	Price is to be dynamically changed @400 per Kg.

Methods :
	Name of Method : showCake() - Override this
	Return type : void
	Modifier : public 
	
	Task :Print the following if message is not null or empty
	"A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-". Other wize display the message from superclass.*/


package Inheritance;
import java.util.Scanner;

public  class Ordercake
{
	String shape ;
	String flavour;
	int quantity;
	float price;
}

private Ordercake(String shape,String flavour,int quantity,float price)
this.shape=round;
this.flavour=venilla;
this.quantity=1 kg,