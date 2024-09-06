package ex06;

public class StudentMain {

	public static void main(String[] args) {

//		Student s1 = new Student();
//		>>>>>> static <<<<<이 붙은 메소드는 객체를 생성하지 않고 사용 가능

		System.out.println(Student.job);
		
		Student.change("차승우");
		
		System.out.println(Student.job);
	}

}
