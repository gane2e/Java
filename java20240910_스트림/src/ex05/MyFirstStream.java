package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice", "bob", "charlie");
		System.out.println(list);
		
		//대문자로 출력
		list.stream()
			.map(str -> str.toUpperCase()) //대문자 변환
			.forEach(n -> System.out.println(n));
		
		//대문자로 변환된 데이터를 리스트로 저장
		List<String> upperCaseNames = list.stream()
									.map(str -> str.toUpperCase())
									.collect(Collectors.toList());
					//				.toList();
		
		System.out.println(upperCaseNames);

		
		
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		Arrays.stream(arr)
			.filter(n -> n%2 ==0)
			.forEach(n->System.out.print(n + " "));
		
		System.out.println();
		
		
		
		
		System.out.println( 
				Arrays.stream(arr)
					.filter(n->n%2==0)
					.boxed()
					.toList() //Arrays.adList 와 비슷한 형태, 변경이 불가하다.
					
				);
		
		
		
		
		List<Integer> iList = Arrays.stream(arr)
							 .filter(n -> n%2 ==0)
							 .boxed()
							 .collect(Collectors.toList());	//값 변경이 가능하다.
			System.out.println(iList);
			
			
			
			iList.add(10);
			iList.add(20);
			iList.remove(0);
			System.out.println(iList);
		
		
	}
}
