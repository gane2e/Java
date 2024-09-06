package ex08;

import java.util.Scanner;

public class 연습3 {

	public static void main(String[] args) {

		String foodName = "";
		int foodPrice = 0;
		int foodQuantity = 0;
		
		System.out.println("음식 이름을 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		foodName = sc.nextLine();
		
		
		System.out.println("음식 가격을 입력해주세요.");
		foodPrice = sc.nextInt();
		
		System.out.println("음식 수량을 입력해주세요.");
		foodQuantity = sc.nextInt();
		
		System.out.printf("%s %d개를 주문하셨습니다. 총 가격은 %d원입니다.",foodName,foodQuantity,foodPrice*foodQuantity);
	

	}

}
