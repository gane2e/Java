package ex01;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {

		String str1 = "korea"; //변경이 불가능한 객체 immutable 이뮤터블
		String str2 = new String ("801020-1079145");
		
		Scanner sc = new Scanner(System.in);

	
		
		char ch = str1.charAt(2); //특정문자 추출 0.1.2 ~ 순
		System.out.println(ch);
		
		
		
		char ch2 = str2.charAt(7);
		String s = (ch2 == '1') ? "남" : "여";
		System.out.println(s);
		
		
		
		int len = str1.length(); //길이값구하기
		System.out.println("len : " + len);
		
		
		
		String oldStr = "java programing";//기존값은 변경되지 않음.
	
		
		String newStr = oldStr.replace("java", "Spring"); //문자열 교체
		
		System.out.println(newStr);
		System.out.println(oldStr); 
		
		String sub1 = oldStr.substring(3); //시작 문자열 번호 정의
		System.out.println(sub1);
		
		String sub2 = oldStr.substring(5, 9); //시작 문자열 번호, 종료 문자열 번호 정의
		System.out.println(sub2);
		
		int len2 = oldStr.indexOf("prog");
		System.out.println(len2); //있으면 문자열 시작번호 알려줌, 없우면 -1
		
		String board = "국어, 영어, 수학, 컴퓨터";
		
		String[] sArr = board.split(",");
		
		for(int i=0; i<sArr.length; i++)
			System.out.println(sArr[i]);
		
		String phone = "010-3380-6423";
		/////////////
		String[] phone2 = phone.split("-"); //split에 정의한 문자열 기준으로 배열에 넣음.
		for(int i=0; i<phone2.length; i++)
			System.out.println(phone2[i]);
		
		String str3 = "com";
		String str4 = "com";
	
		System.out.println(str3 == str4);//기본자료형
		
		String str5 = new String("com");
		String str6 = new String("com");
		
		System.out.println(str5 ==str6);
		
		boolean b = str3.equals(str4);
				System.out.println(b);
				
		boolean b2 = ! str5.equals(str6);//참조자료형의 값비교는 변수명.equals사용
		// = 은 대소문자구분 포함
		// = ! 은 대소문자 구분 미포함
			System.out.println(b2);
			
//		System.out.println(oldStr.startsWith("java")); 
		System.out.println(oldStr.startsWith("Spring")); 
		
		String str7 = "    JAVA  ~~  Spring     ";
		System.out.println(str7.length()); //문자개수 표출
		
		// 앞뒤공간 제거
		String str8 = str7.trim();
		System.out.println(str8);
		System.out.println(str7);
	
		System.out.println(str8.toUpperCase());//문자열을 대문자로 변경해줌
		System.out.println(str8.toLowerCase());//문자열을 소문자로 변경해줌
	}

}
