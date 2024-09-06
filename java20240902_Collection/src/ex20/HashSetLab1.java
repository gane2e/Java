package ex20;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ex11.Member;

public class HashSetLab1 {
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("?");
		return super.equals(obj);
	}

	public static void main(String[] args) {
	final int MAX = 5;
	int count = 0;
		
	Map<String, Integer> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	while(true) {

		System.out.println("나라 이름을 입력하세요.");
		String na = sc.nextLine();
		System.out.println("인구 수를 입력하세요.");
		int pup = Integer.parseInt(sc.nextLine());
		System.out.println("*저장되었습니다.*");
		
		if(map.containsKey(na)) {
			System.out.printf("나라명 %s는 이미 저장 되어있습니다.\n", na);
			continue;
		}
		map.put(na, pup);
		count++;

		if(count>MAX) break;
	
		}	

	Set<String>set = map.keySet();
	for(String s : set)
		System.out.println(s + " " + map.get(s));
	
	
	}
	

}
