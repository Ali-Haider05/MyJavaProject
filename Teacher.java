package mix_OPP;

public class Teacher extends Person_2 implements Salary {
	private String  employeeID;
	private String  subject;
	private double  basicSalary;
	// Getter and Setter Method
	public String getEmployID() {
		return this.employeeID;
	}
	public String getSubject() {
		return this.subject;
	}
	public double getBasicSalaery() {
		return this.basicSalary;
	}
	public void setEmployID(String id) {
		this.employeeID=id;
	}
	public void setBasicSalary(double b_salary) {
		this.basicSalary=b_salary;
	}
	public void setSubject(String Subject) {
		this.subject=Subject;
	}
	
   public  void showDetail() {
    	System.out.println("Employ ID:"+   this.employeeID);
    	System.out.println("Suject:"+      this.subject);
    	System.out.println("Basic Salary:"+this.basicSalary);
    }
   public void showDetail(String extraInfo) {
	   System.out.println("City:"+extraInfo);
   }
   public double calculateSalary() {
	    return (this.basicSalary*30);
   }
   
}
