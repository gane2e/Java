package ex12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Car{
	
	
	private String model;
	private String color;
	public Car(String model,String color) {
		this.model = model;
		this.color = color;
		}
	
	@Override
	public String toString() {
		return "model:" + model + " " + ", color:" + color;
	}
	
	@Override
	public int hashCode() {
		return model.hashCode() + color.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		
		if ( (this.model.equals(m) && (color.equals(c))))
			return true;
		else
			return false;
	}
	
}

public class HashSet05 {

	public static void main(String[] args) {


		Set<Car> set = new HashSet<>();
		
		set.add(new Car("소나타", "흰색"));
		set.add(new Car("k8", "흰색"));
		set.add(new Car("k8", "검정색"));
		set.add(new Car("그랜저", "회색"));
		set.add(new Car("k8", "검정색"));
		set.add(new Car("그랜저", "회색"));
		
		//Iterator => 인터페이스.
		Iterator<Car> itr = set.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("---------------------------");
			
		}
}
