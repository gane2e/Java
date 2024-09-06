package ex02;

class Animal{
	
	private String name;//멤버변수, 인스턴스 변수 => 생성된 객체들이 개별적 가지고 있음.
	private static int count; //정적변수, 클래스 변수 => 공유지원
	
	public Animal(){
		this("동물");
	}
	
	public Animal(String name){
		this.name = name;
	}
	
	void speak() {
		
	}
	
	void info() {//메소드, 인스턴스 메소드
		
		System.out.println(name + "입니다.");
		count++;
		staticInfo();
	}
	

	static void staticInfo() {//정적메소드, 클래스메소드
		count++; //정적변수(클래스변수)
		func(); //정적메소드(클래스메소드)
	}

	static void func() {
		
	}

	public class MainAnimal {
		
		public static void main(String[] args) {

			int num = 10;
			Animal animal = new Animal("동물");//객체 생성, 인스턴스 생성
		
			animal.info();
		
			Animal animal2 = new Animal();
			animal2.info();
		}

	}	
}	
