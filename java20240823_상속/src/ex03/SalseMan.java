package ex03;

public class SalseMan extends Person{
	

	String company;
	int salary;

	
	public SalseMan() {}
	public SalseMan(String name, int age, String company, int salary) {
		super(name, age);
		this.company = company;
		this.salary = salary;
	}
	
	@Override
	public void introduce(){
		System.out.printf("제 이름은 %s 이고 나이는 %d 입니다. 회사는 %s 입니다.\n", name, age,company);
	}

	final public void work() {
		System.out.println(name + "이(가) 근무중입니다.");
	}
	
	
}

