package arrayList;

import java.util.ArrayList;

public class ClassMain {

	public static void main(String[] args) {
		
	ArrayList<String> Student=new ArrayList<String>();
	Student.add("Ali");
	Student.add("Waqar");
	Student.add("Ahmad:");
	Student.add("Bilal");
	Student.add("Abdullaha");
	
	for(int i=0;i<Student.size();i++) {
		System.out.println(Student.get(i));
	}
	Student.add(1, "Haider");
	Student.remove(0);
	Student.addLast(null);
	
	for(int i=0;i<Student.size();i++) {
		System.out.println(Student.get(i));
	}
	System.out.println(Student);

	}

}
