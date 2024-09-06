package ex04;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		


		
		String[] subject = new String[10];
		int index = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("1.과목등록 | 2.과목목록보기 | 3.종료");
			System.out.println("번호 입력 > ");
			int num = Integer.parseInt(sc.nextLine());		//엔터제거
			
	
			switch(num) {
			case 1 :
				System.out.println("과목명 입력 > ");
				subject[index++] = sc.nextLine();
//				sc.nextLine();
				break;
			case 2 :
				for(int i=0; i<index; i++) 
					System.out.print(subject[i] + ", ");
				System.out.println();
				break;
			case 3 :
				flag = false;
				break;
			
			}
		}
		System.out.println();
	}

}
