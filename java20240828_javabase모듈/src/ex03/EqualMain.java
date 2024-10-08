//hashcode, equals
package ex03;

import java.util.HashSet;

class A {
	
	String id;
	int age;
	
	A(String id, int age) {
		this.id = id;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println();
		A a = (A)obj;
		return age == a.age;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode--------");
		return Integer.hashCode(age);
	}
	
}
  public class EqualMain {

	public static void main(String[] args) {

		A a1 = new A("ID1239", 20);
		A a2 = new A("ID1234", 20);
		A a3 = new A("ID1234", 21);
		
//		System.out.println(a1.equals(a2));
		
		HashSet set = new HashSet();
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
	}

}
