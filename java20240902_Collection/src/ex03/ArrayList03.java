package ex03;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

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
