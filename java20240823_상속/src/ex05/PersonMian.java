package ex05;

public class PersonMian {

	public static void main(String[] args) {
//
//		double d1 = 10.2;
//		int num = 10;
//		//num = d1;
//		d1 = num;
		
		//상위클래스는(Person) 하위클래스를(Student) 참조할 수 있다.
		//단, 접근할 수 있는 영역은 상위클래스(Person) 내로 한정된다.
		Person p1 = new Person();
		
		Person ps1 = new Student();

		
		Person pps1 = new PartTimeStudent();
		
		
		//하위클래스는 상위클래스를 참조할 수 없다.
		Student s1 = new Student();
		Student s2 = new PartTimeStudent();
//		Student s3 = new Person();
		
//		PartTimeStudent ps1 = new PartTimeStudent();
//		PartTimeStudent ps2 = new PartTimeStudent();
	}

}
