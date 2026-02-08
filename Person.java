package mix_OPP;

public abstract class Person {
  private String name;
  private int age;
  // Abstract Method:
   abstract void showDetail();
   public String getNmae() {
	   return this.name;
   }
    public int getAge() {
    	return this.age;
    }
    // Setter Method 
    public void setAge(int age) {
    	this.age=age;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
   
}
