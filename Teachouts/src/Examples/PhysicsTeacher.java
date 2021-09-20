package Examples;
class Teacher {
   String designation = "Teacher";
   String collegeName = "Beginnersbook";
   String campus="blood";
   void does(){
	System.out.println("Excelent in Teaching side");
   }
}

public class PhysicsTeacher extends Teacher{
   String mainSubject = "Physics is the best ";
   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}