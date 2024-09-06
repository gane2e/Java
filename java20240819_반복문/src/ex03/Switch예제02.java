package ex03;

public class Switch예제02 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*12)+1; //0~4
		System.out.println("월 : " + n);
		
		switch(n) { //스위치 괄호안과 매칭되는것이 출력
		case 12 : 
		case 1 : 
		case 2 : 
			System.out.println("겨울");
			break;
		case 3 : 
		case 4 : 
		case 5 : 
			System.out.println("봄");
			break;
		case 6 : 
		case 7 : 
		case 8 : 
			System.out.println("여름");
			break;
		case 9 : 
		case 10 : 
		case 11 : 
			System.out.println("가을");
			break;
		}

	}

}
