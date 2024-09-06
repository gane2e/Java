package ex02;

class A {
	
	String id;
	
	A(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		
		/*if(obj instanceof A a) {
			if(id.equals(a.id))
				return true;
		} 
		return false; */
		
		A a = (A)obj;
		return id.equals(a.id);
		
	}
}
  public class EqualMain {

	public static void main(String[] args) {

		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		//문자열이 같은지 검사 변수명1.equals
		System.out.println("");
		A a1 = new A("ID1234");
		A a2 = new A("ID1234");
		System.out.println(a1.equals(a2));
	}

}
