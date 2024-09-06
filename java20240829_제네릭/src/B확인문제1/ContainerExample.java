package B확인문제1;

public class ContainerExample {

	public static void main(String[] args) {

		Container<String> container1 = new Container<>();
		container1.setName("홍길동");
		String str = container1.getName();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<>();
		container2.setName(6);
		int value = container2.getName();
		System.out.println(value);
	}
		
}

	class Container<T>{
		
		private T obj;

		public T getName() {
			return obj;
		}

		public void setName(T obj) {
			this.obj = obj;
		}

	}
	
