package ex03;

public class Switch예제01 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*9); //0~4
		System.out.println("n : " + n);
		
		switch(n) { //스위치 괄호안과 매칭되는것이 출력
		case 0 : 
			System.out.println("0000");
			break; //브레이크 안하면 성립값 다음 값도 모두 출력함
		case 1 : 
			System.out.println("111");
			break;
		case 2 : 
			System.out.println("222");
			break;
		case 3 : 
			System.out.println("333");
			break;
		case 4 : 
			System.out.println("444");
			break;
		default:
			System.out.println("그 외 값");
		}

	}

}
