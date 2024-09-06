package ex02;

//final class Student => Student 클래스 상속 불가.
public  class Student extends Person{
	

	private String school;
	private String studentID; //학번
	
	
	public Student() {}
	public Student(String school, String studentID) {

//		
//		this.school = school;
//		this.studentID = studentID;
		this("kim", 20, school,studentID);
//		
	}
	
	public Student(String name, int age,  String school, String studentID) {

		super(name, age);//없으면 기본생성자 호출함
		this.school = school;
		this.studentID = studentID;
	}
	
	@Override //@:어노테이션, @Override -> 상위클래스 메소드를 하위클래스가 제정의했다.
	//안써도 문제x 쓰면 직관적 / 메소드명이 상위<->하위 동일해야함
	public void introduce() {
		super.introduce();//오버라이딩한 상위클래스 메소드 호출
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, studentID);
	}
	
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	

}
