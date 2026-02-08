package mix_OPP;

import java.util.Scanner;

public class MainClass {
   public static void main(String []args) {
	   //Student Class 
	  /* Student object=new Student();
	    Scanner sc=new Scanner(System.in);
	    String name;
	    int age;
	    String studentID;
	    String grade;
	    System.out.println("Enter your name:");
	    name=sc.next();
	    System.out.println("Enter your Age:");
	    age=sc.nextInt();
	    System.out.println("Enter yuor Grade:");
	    grade=sc.next();
	    System.out.println("Enter your Student ID:");
	    studentID=sc.next();
	    object.setAge(age);
	    object.setName(name);
	    object.setGrade(grade);
	    object.setStudentID(studentID);
	    
	    object.showDetail();*/
	    // Teacher Class 
	    Teacher object2=new Teacher();
	    String name2;
	    int age2;
	    String EmpolyId;
	    String subject;
	    double basicSalary;
	    String extraInfo;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your name ,age,ID,Subject  Basic Salary and Extra Information:");
	    name2=sc.next();
	    age2=sc.nextInt();
	    EmpolyId=sc.next();
	    subject=sc.next() ;
	    basicSalary=sc.nextDouble();
	    extraInfo=sc.nextLine();
	    object2.setName(name2);
	    object2.setAge(age2);
	    object2.setEmployID(EmpolyId);
	    object2.setBasicSalary(basicSalary);
	    object2.setSubject(subject);
	    object2.showDetail();
	    object2.showDetail(extraInfo);
	    object2.calculateSalary();
	    
   }
}
