package ex03;

public  class Student extends Person{

	String school;
	String studentID;
	
	public Student() {}
	public Student(String name, int age, String school, String studentID) {
		super(name, age);
		this.school = school;
		this.studentID = studentID;
	}

	 public Student(String school, String studentID) {
		this("-", 0, school, studentID);
	}

	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
	
}
