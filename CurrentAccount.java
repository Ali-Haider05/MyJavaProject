package bank_ATM;

public class CurrentAccount extends BankAccount {
	  public void withdraw(double amount) {
		  int loan=5000;
		  double accountBalance=super.getbalance();
		  if(amount<accountBalance) {
			  if(accountBalance-loan-loan<=-5000) {
				  System.out.println("Your amount is withdraw :you use bank loan");
			  }
			  
		  }
	  }

}
