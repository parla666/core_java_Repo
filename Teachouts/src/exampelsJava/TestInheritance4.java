package exampelsJava;

class InheritanceObject{  
void msg(){System.out.println("Hello");}  
}  
class Object2 {  
void msg(){System.out.println("Welcome");}  
}  

class Object3 extends InheritanceObject {  //suppose if it were  ( // here we have taken two objects so that's why it showing compaile error)
}


 class TestInheritance4 {
 public   void main(String args[]){  
	 Object3 obj=new Object3();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}
 
 
 
 
 
 ///// it showes that "compaile error" while running in cmd 