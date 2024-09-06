package ex20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import ex11.Member;

public class HashMapLab1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Set<Integer> set = new HashSet<>();
		

		while(true) {
			set.add(random.nextInt(30)+1);
			if(set.size()>=10) break;
		}
		
		Iterator<Integer> itr = set.iterator(); //반복자 획득

		System.out.print("오늘의 로또 번호 : ");
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		
//		for(int n : set)
//			System.out.println(n + " ");
		
		
		
	}

}
