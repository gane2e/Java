package ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");

		for(int i=0; i<list.size(); i++) 			
			System.out.print(list.get(i) + " ");
		System.out.println("");
		
		list.remove(0); // 0번배열 삭제.
		
		for(Object obj : list)
			System.out.print(obj + " ");
	}

}
