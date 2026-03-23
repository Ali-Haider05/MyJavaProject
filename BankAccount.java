package bank_ATM;

public class BankAccount {
     private int    accountNumber;
     private double balance;
     private int    pin;
     
     public  int getaccountNumber() {
    	 return accountNumber;
     }
     public double getbalance() {
    	 return balance;
     }
     public void setbalance(double balance) {
    	 this.balance=balance;
     }
     public void setpin(int userpin) {
    	 this.pin=userpin;
     }
     public void setAccountBalance(int a_number) {
    	this. accountNumber=a_number;
     }
     public boolean  validatePin(int pin) {
    	 boolean checkPin=false;
    	if( this.pin==pin) {
    		checkPin=true;
    	}
    	return checkPin;
     }
     public void deposite(double amount) {
    	 if(amount>0) {
    		 this.balance+=amount;
    		 System.out.println("Thank you ! your amount is deposite:");
    	 }
    	 else
    		 System.out.println("Invalid amount:");
     }
     public void withdraw(double withdrawAmount) {
    	 if(withdrawAmount<=this.balance) {
    		 this.balance-=withdrawAmount;
    		 System.out.println("Your amount is withdraw from your account number:");
    		 System.out.println("Account Number:"+this.accountNumber);
    		 System.out.println("Withdraw Amount:"+withdrawAmount);
    		 System.out.println("Total balance:"+this.balance);
    	 }
     }
     public void displayAccount() {
    	 System.out.println("Bank Account Number:"+this.accountNumber);
    	 System.out.println("Total amount :"+       this.balance);
     }
}
