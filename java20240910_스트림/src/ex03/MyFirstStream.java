package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {

		List<String> list2 = new ArrayList<String>();
		list2.add("AA");
	
		//인덱스삭제
		list2.remove(0);
		
		
		//asList => 초기값 설정만 가능하고 수정은 불가능함 >>>(추가/삭제 불가)<<<
		List<String> list = Arrays.asList("AA","BBB","CCCC","DDDDD","EEEEEE");
	
		/*
		//ArrayList에 담아 수정 가능
		list = new ArrayList<>(list);
		
		list.remove(0);
		
		for(String str : list)  
			System.out.println(str + " ");
		*/
		
		list.stream()
			.map(n -> n.length())
			.forEach(n-> System.out.print(n + " "));

		list.stream()
		.mapToInt(n -> n.length())
		.forEach(n -> System.out.print(n + " "));
			
	}
}
