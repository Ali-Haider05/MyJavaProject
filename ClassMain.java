package project2;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {
 public static void main(String []args) {
     Person object=new Person();
     Scanner sc=new Scanner(System.in);
     Person[]arr=new Student[5];
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("Enter your name::");
    	 arr[i].name=sc.next();
    	 System.out.println("Enter your id::");
    	 arr[i].id=sc.nextInt();
    	 System.out.println("Enter your basic Allowence::");
    	 arr[i].basicAllowance=sc.nextDouble();
     }
 }
}
