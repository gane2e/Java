package ex09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Num{
	private int num;
	public Num(int num) {this.num = num;}
	
	@Override
	public String toString() {
//		return num + ""; //10 + "" => "10" (문자열로 반환)
		return String.valueOf(num);
		// String.valueOf => 숫자를 문자열로 변환하는 메서드
	}
}

public class HashSet03 {

	public static void main(String[] args) {

		Set<Num> set = new HashSet<>();
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(30)); //중복데이터 저장하지 않음 (Set 사용)
		set.add(new Num(10)); //중복데이터 저장하지 않음 (Set 사용)
		
		Iterator<Num> itr = set.iterator(); //반복자 획득

		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("-----------------");
		
		itr = set.iterator(); //반복자 획득
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
			
		

		}
}
