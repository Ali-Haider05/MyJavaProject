package project2;

public class Student extends Person{
	 double gpa;
	 public void calculatePay(double gpa) {
		 if(this.gpa>3.5) {
			 super.basicAllowance+=500;
		 }
	 }

}
