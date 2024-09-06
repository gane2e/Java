package ex01;

public class Student {
	
	private String name;
	private int age;
	private String school;
	private String studentID; //학번
	
	public Student(String name, int age, String school, String studentID) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.studentID = studentID;
	}
	
	public void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
		System.out.printf("학교는 %s이고, 학번은 %s살 입니다.\n", school, studentID);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	

}
