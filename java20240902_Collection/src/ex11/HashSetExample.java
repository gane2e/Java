package ex11;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<>();

		//Member 객체 생성
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		//저장 된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
