package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDY", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		
		//가격 합 출력
		int num = list.stream()
				.mapToInt(price -> price.getPrice())
				.sum();
		
		System.out.println(num);
		
		//가격 5000이상의 합을 출력
		int total = list.stream()
				.filter(price -> price.getPrice() >= 5000)
				.mapToInt(price -> price.getPrice())
				.sum();
		
		System.out.println(total);
		


		
	}
}
