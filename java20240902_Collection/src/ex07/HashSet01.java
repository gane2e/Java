package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add("kor");
		set.add("eng");
		set.add("math");
		set.add("com");
		
		set.add("kor"); //중복데이터 들어가지 않음 (Set)
		set.add("eng");
		set.add("math");
		set.add("com");
		
		
		Iterator<String> itr = set.iterator(); //반복자 획득
		
		//hasNext => 다음 요소가 있는지 판단하는 메서드
		//next => 다음 요소를 가져오는 메서드
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("-----------------");
		
		itr = set.iterator(); //반복자 획득
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
			
		

		}
}
