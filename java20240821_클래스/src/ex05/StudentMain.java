package ex05;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();//오버로딩
		s1.info();
		
		Student s2 = new Student("차은우", 30, "000-1234-1234"); 
		s2.info();
		
//		s2.nameChange("차우은");
//		s2.nameInfo();
//		
//		System.out.println(s2.getName());
		
	}

}
