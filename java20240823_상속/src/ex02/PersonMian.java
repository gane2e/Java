package ex02;

public class PersonMian {

	public static void main(String[] args) {

		Person person = new Person("홍길동", 20);

		person.introduce();
		person.walk();
		
		System.out.println("-------------------------");
		
		Student student = 
				new Student("홍길동",20, "아주대학교", "12345678");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("--------------------------");

		SalesMan sales = new SalesMan("삼성", 10000);
		sales.introduce();
		sales.walk();
		sales.wolk();
	}

}
