package game;

import java.util.Scanner;

public class UserInformation {
	   String name;
	   int age;
	   String educationLevel;
static	String email ;
static char lastChar;

 public  static	void userInput (UserInformation In ){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your Name::");
		In.name=sc.next();
		System.out.println("Enter your age::");
		In.age=sc.nextInt();
		System.out.println("Enter your Education Level::");
		In.educationLevel=sc.next();
		do {
		System.out.println("Enter your Personal Email ::");
		In.email=sc.next();
		 lastChar=email.charAt(email.length()-1);
		if( lastChar=='m') {
			System.out.println("Pleace Wait! your Application is in process!...........");
			System.out.println("");
			System.out.println("SUCCESSFUL! Your Email is valid!");
			
		}
		else {
			System.out.println("INVALID!PLEACE SLECEt '@' And gmail.com in your mail! ");
			System.out.println("Again Enter your Valid mail!");
			
		}
 }while(lastChar!='m');
		
	}

}


