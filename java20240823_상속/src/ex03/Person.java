package ex03;

public class Person {
	
	String name;
	int age;
	
	public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public void introduce(){
		System.out.printf("제 이름은 %s 이고 나이는 %d 입니다.", name, age);
	}
	public void walk(){
		System.out.println(name + "이(가) 걷고 있습니다.");	}

}
