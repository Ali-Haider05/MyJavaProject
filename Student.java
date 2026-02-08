package mix_OPP;

public class Student extends Person  {
   private  String  studentID;
   private   String grade;
   // Getter Method
   public String getStudentID() {
	   return this.studentID;
   }
   public String getGrade() {
	   return this.grade;
			   
   }
   // Setter Method 
   public void setStudentID(String ID) {
	   this.studentID=ID;
   }
   
   public void setGrade(String grade) {
	   this.grade=grade;
   }
   
   
	@Override
	void showDetail() {
	System.out.println( "Ali haider :");
	 System.out.println("Enter your name :"+ this.grade);
	 System.out.println("Emtegusd m a");
	 System.out.println("enter your name ");
	  
	  
		
	}
   
}
