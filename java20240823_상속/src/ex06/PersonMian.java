package ex06;

public class PersonMian {

	public static void main(String[] args) {
		
		//상위클래스는(Person) 하위클래스를(Student) 참조할 수 있다.
		//단, 접근할 수 있는 영역은 상위클래스(Person) 내로 한정된다.
		Person p1 = new Person();
		
		Person ps1 = new Student();

		
		//Student s1 = new Student();
		
		//Student s2 = new Person();
		/*
		 * 이유 : s2는 student 참조변수이기때문에
		 * Student와 person 정보를 다 사용할수있다.
		 * 그러나 person 객체를 참조하면 그 객체안에는 
		 * person 정보만 있기 때문에 기능이 제한된다.
		 */
		
		Student s2 = (Student)ps1;
		
		Person p2 = new PartTimeStudent();
		
		Student s3 = (Student)p2;
		
		PartTimeStudent pp3 = (PartTimeStudent)p2;
	}

}
