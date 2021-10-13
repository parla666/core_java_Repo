package exampelsJava;

class adderNum{  
static int add1(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading  {  
public static void main(String[] args){  
System.out.println(adderNum.add1(12,56));//ambiguity  
}}  