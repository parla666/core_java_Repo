package exampelsJava;

 class EmployeetTest {
	 float salary=60000;

}
class  Programmer extends EmployeetTest{
	int bonus=12000;

public static void main (String arg[]) {
Programmer p =new Programmer();
System.out.println("Employee salary  :" +p.salary);
System.out.println("employee Bonus  :"+p.bonus);
}

}