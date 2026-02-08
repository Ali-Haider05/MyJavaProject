package project2;

public class Faculty extends Person {
   int yearOfExperience;
   public  void  calculatePay() {
	   if(this.yearOfExperience>20) {
		   super.basicAllowance+=200;
		   
	   }
   }
}
