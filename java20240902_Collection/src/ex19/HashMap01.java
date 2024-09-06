package ex19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {

		//key : 중복X, value:중복OK
		// >>> 순차 출력 (반복문, iterator로 출력)

		Map<Integer, String> map = new HashMap<>();

		map.put(11, "kim");
		map.put(21, "park");
		map.put(32, "hong");
		map.put(43, "Lee");
		map.put(44, "cho");
		map.put(32, "sujin");
		map.put(17, "park");
		
		
		//반환타입이 set, key 값만 리스트 저장
		Set<Integer> set = map.keySet();
		
		for(Integer n :set) 
			System.out.print(n + " ");
		System.out.println();
		System.out.println("---------------------------");
		
		for(Integer n :set) 
			System.out.println(map.get(n));
		System.out.println("---------------------------");
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
	}
	

}
