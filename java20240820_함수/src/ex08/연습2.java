package ex08;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {

	System.out.println("구구단의 단 수를 입력해주세요.");
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for(int i=1; i<=9; i++) {
		System.out.printf("%d X %d = %d\n", n, i, n*i);
	}
	
	

	}

}
