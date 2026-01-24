package game;

import java.util.Scanner;

public class Dispaly {
	 static Scanner sc=new Scanner (System.in);
	public static int  logicalQuestion() {
		
	
		System.out.println("------------LOGICAL QUESTION--------");
		
		String[]  arr={"what is the last number '2' ,'4','8','16','32' ....?  "};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		        System.out.println("\n1.52\n2.62\n3.64\n4.65");
		        int choice;
		        System.out.println("Enter your answer (1-4))");
		        
		        choice=sc.nextInt();
		        if(choice==2)
		        	return 1;
		        
		        return 0;
	
	}
	public static int mathQuestion() {
		System.out.println("----SECOND QUESTION MATH-----");
		 String [] arr= { "What is the answer : 12+ 9-[(6*7)/6]"};
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]);
		 }
		 System.out.println();
		 System.out.println("1.14\n2.16\n3.10\n4.18");
		 System.out.println("Enter your answer between (1-4)");
		 int choice=sc.nextInt();
		 if(choice==1)
			 return 1;
		 return 0;
		 
		 	
	}
	 public static int  programmingQuestion() {
		 System.out.println("----LAST QUESTION programming------");
		 String [] arr= {"what is the output int a; cout<<a  "};
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]);
		 }
		 System.out.println("1.12\n2.0\n3.ABCD1234\n4.ERROR");
		 int choice;
		 System.out.println("Enter your answer between (1-4)");
		 choice=sc.nextInt();
		 if(choice==3) {
			 return 1;
		 }
		 return 0;
	 }

}
