package ex05;

public class Dog extends Animal{
	
	private int age;
	
	public Dog(){}
	
	public Dog(String name, int age){
		super(name);
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	@Override
	void info() {
//		System.out.println(getName() + "입니다.");
		super.info();
		System.out.println(age + "살 입니다.");
	}
	
	@Override
	void speak() {
		System.out.println("멍멍");
	}
	
	
}
