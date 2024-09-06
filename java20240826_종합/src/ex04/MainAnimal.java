package ex04;


public class MainAnimal {

	public static void main(String[] args) {

		//상위 클래스 하위 클래스 참조할 수 있다.
		//단, 접근 할 수 있는 영역은 자신이나 본인 클래스 또는 본인 클래스의 부모클래스만 접근 가능하다.
		
		Animal2 an = new Animal2();
		Animal2 an2 = new Dog();
		Animal2 an3 = new 진도개();
		
		Dog dog = new Dog();
		Dog dog2 = new 진도개();
		//Dog dog3 = new Animal(); error 상위클래스 참조불가
		
		진도개 jin = new 진도개();
//		진도개 jin2 = new Animal(); error
//		진도개 jin3 = new Dog(); error
		
		System.out.println("-----------------------------");
		//하위 클래스는 상위클래스 참조불가
		//Dog dog3 = new Animal(); error 상위클래스 참조불가
		//단..예외가존재함..
		
		Animal2 an4 = new Dog();
		Dog dog3 = (Dog)an4;
		dog3.speak();
		
//		진도개 jin4 =  new Animal();
		진도개 jin4 = (진도개)an3;//강제타입변환
	}

}
