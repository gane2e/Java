package ex17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Queue01 {

	public static void main(String[] args) {

		List<Integer> a1 = new ArrayList<>();
		List<Integer> l1 = new LinkedList<>();
		Set<Integer> hs = new HashSet<>();
		Set<Integer> ts = new TreeSet<>();
		List<Integer> ck = new Stack<>();
		
		/*
		 * Queue 는 인터페이스이다. 따라서 객체생성을 할 수 없다.
		 * Queue 를 사용하기 위해서는 Queue 를 구현하든가, 아니면 구현된 객체를 사용하면 된다.
		 */
		Queue<Integer> qu = new LinkedList<>();
		
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		}
}
