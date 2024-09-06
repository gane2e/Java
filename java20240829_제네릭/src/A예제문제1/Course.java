package A예제문제1;
//강의
public class Course {

	//모든사람이면 등록 가능
	public static void registerCourse1(Applicant <?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
	//학생만 등록 가능
	public static void registerCourse2(Applicant <? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
	}
	
	//직장인 이상 (직장인 / 일반인)만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}
