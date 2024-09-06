package ex14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {

		
		//TreeSet => 자동정렬 오름차순
		//영문 => A~Z, a~z 순
		Set<String> set = new TreeSet<>();
		
		set.add("kor");
		set.add("eng");
		set.add("KOR");
		set.add("ENG");
		set.add("Math");
		set.add("math");
		set.add("abc");
		
		Iterator<String> itr = set.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
			
		}
}
