package ex06;


public class MainAnimal {

	public static void main(String[] args) {

		
//		Animal an = new Animal(); --> 추상클래스. 객체 생성 불가함
		
		Dog dog = new Dog("강아지", 2);
		dog.speak();

		Cat cat = new Cat("고양이", 1);
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}

}
