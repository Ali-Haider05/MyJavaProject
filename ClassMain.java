package bank_ATM;

import java.util.Scanner;

public class ClassMain {
 public static void main(String []args) {
	 int accountNumber;
	 int totalAccountBalance;
	 int accountType;// 1 for Saving account 2 for Current Account
	 int pin ;
	 Scanner sc=new Scanner(System .in);
	 System.out.println("Enter your Account Pin:");
	 pin=sc.nextInt();
	 System.out.println("Enter your Account Number:");
	 accountNumber=sc.nextInt();
	 System.out.println("Enter your Account Balance:");
	 totalAccountBalance=sc.nextInt(); 
	 System.out.println("Enter your Accont type :1 for current Account 2 for Savings Account:");
	 accountType=sc.nextInt();
	 BankAccount object;
	 if(accountType==1) {
		 object=new CurrentAccount();
	 }
	 else
		 object=new SavingsAccount();
	 
	 object.setpin(pin);
	 object.setbalance(totalAccountBalance);
	 object.setAccountBalance(accountNumber);
	 int choice ;
	 System.out.println("Enter your choice 1 for deposite 2 for withdraw 3 for display");
	 choice=sc.nextInt();
	 if(choice==1) {
		 double deposite;
		 System.out.println("Enter your Deposit Amount :");
		 deposite=sc.nextInt();
    	 object.deposite(deposite);
	 }
	 else if(choice==2) {
		 int withdrawAmount;
		 System.out.println("Enter your WithDraw Amount:");
		 withdrawAmount=sc.nextInt();
		 object.withdraw(withdrawAmount);
	 }
	 else {
		 object.displayAccount();
	 }
	 
 }
}
