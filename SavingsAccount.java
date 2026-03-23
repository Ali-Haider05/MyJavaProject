package bank_ATM;

public class SavingsAccount extends BankAccount {
     public void withdraw(double amount) {
    	 double  accountBalance=super.getbalance() ;
          if(accountBalance-amount<1000) {
         System.out.println("Minimum balance must be 1000");
          }
          else {
        	 accountBalance-=amount;
        	 super.setbalance(accountBalance);
        	 System.out.println("Your amount is withdraw :");
        	 System.out.println("your rammining balance:"+getbalance());
          }
     }
     public void addInterest(double rate) {
    	 double totalBalance=super.getbalance();
    	 double interest=totalBalance*rate/100;
    	 double newBalance=totalBalance+interest;
    	 super.setbalance(newBalance);
    	 System.out.println("your interest rate add:");
     }
}
