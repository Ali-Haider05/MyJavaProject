package game;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------WELCOME TO HUMAN INTELLIGENCE ANALYZER-----------");
		System.out.println();
		UserInformation m=new UserInformation();
		 m.userInput(m);
		 Dispaly o= new Dispaly();
		 int logical=o.logicalQuestion();
		 int math=o.mathQuestion();
		 int programming=o.programmingQuestion();
		 
		 String result;
		 if(logical==1&&math==1&&programming==1) {
			 result="Excllent ! Intaligaent ";
		 }
		 else if(logical+math+programming==2) {
			 result="GOOD ! Average ";
			 
		 }
		 else if(logical+math+programming==1) {
			 result="Poor ! Need Improvement";
		 }
		 else 
			 result ="Fali ! sorry ";
		 
		 System.out.println("-------STUDENT REPEORT-----");
		 System.out.println(" STUDENT    NAME ::"         + m.name);
		 System.out.println(" STUDENT    AGE::"           + m.age);
		 System.out.println(" Student    Education LEVEL" + m.educationLevel);
		 System.out.println(" Student     EaliMail           "+ m.email);
		 
		 System.out.println(" STUDENT RESULT ::"+  result);
		 System.out.println("-----------------------------");
		 System.out.println();
		 System.out.println("THANK FOR USE HUMAN INTELLIGENCE ANALYZER MAD BY ALI HAIDER");
		 
		 
	}
	
	

}
