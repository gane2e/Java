package ex03;

public class PersonMain {

	public static void main(String[] args) {


		Student student = 
				new Student("홍길동", 20, "인하대학교", "24학번");
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("---------------------------");

		Student student2 = 
				new Student("인하대학교", "24학번");
		student2.introduce();
		student2.study();
		
		System.out.println("---------------------------");
		
		SalseMan salse = 
				new SalseMan("김철수", 40, "삼성전자", 1000);
		salse.introduce();
		salse.walk();
		salse.work();
		
		
		
		

	}

}
