package ex08;

import java.util.Scanner;

public class 연습6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		
		while(flag) {
			
			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			
				if(name.equals("종료")) {
					System.out.println("프로그램 종료");break;}
			
			System.out.println("나이를 입력하세요.");
			String age= sc.nextLine();
			
			System.out.println("입력한 이름 : " + name + " 나이 : " + age);
			
			
			}
			
		}
	

	}
