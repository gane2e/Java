package A예제문제1;

public class GenericExample {

	public static void main(String[] args) {

		
		//모든사람이 신청 가능한 제네릭 타입
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		System.out.println();
		
		//학생만 신청 가능한 제네릭 타입
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
	}

}
