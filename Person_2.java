package mix_OPP;

public abstract class Person_2 {
   private String name;
   private int age;
    
   public abstract void showDetail();
   
   public String getName() {
	   return this.name;
   }
   public int getAge() {
	   return this.age;
   }
   public void setAge(int age) {
	   this.age=age;
   }
   public void setName(String name) {
	   this.name=name;
   }
}
interface Salary{
	public double calculateSalary();
}
