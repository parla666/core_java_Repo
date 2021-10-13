
package Examples;

public class Teacher2 {
	 
		   private String designation = "the best Teacher";
		   private String collegeName = "in the Beginnersbook school ";
		   public String getDesignation() {
			return designation;
}
		   
		   protected void setDesignation(String designation) {
				this.designation = designation;
			   }
			   protected String getCollegeName() {
				return collegeName;
			   }
			   protected void setCollegeName(String collegeName) {
				this.collegeName = collegeName;
			   }
			   void does(){
				System.out.println(" i like that Teaching");
			   }
			}		   
             class Parla extends Teacher{
	       String mainSubject = "Physics";
	       public static void main(String args[]){
		Parla obj = new Parla();
		/* Note: we are not accessing the data members 
		 * directly we are using public getter method 
		 * to access the private members of parent class
		 */
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
	   }
		private char[] getDesignation() {
			// TODO Auto-generated method stub
			return null;
		}
		private char[] getCollegeName() {
			// TODO Auto-generated method stub
			return null;
		}
	}
             
		   
		   
		   
		  