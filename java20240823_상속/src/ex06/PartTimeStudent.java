package ex06;


//학생 중 알바하는 학생
public class PartTimeStudent extends Student{
	
	String job;
	int pay;
	
	PartTimeStudent(){}
	PartTimeStudent(String name, int age,  String school, String studentID, String job, int pay){
		super(name, age, school,studentID);
		this.job = job;
		this.pay = pay;
	}
	
	public void work() {
		System.out.println("근무 중!");
	}
	@Override
	public void introduce() {
		super.introduce();//오버라이딩한 상위클래스 메소드 호출
		System.out.printf("근무지는 %s이고, 페이는 %d 입니다.\n", job, pay);
	}
	
}
