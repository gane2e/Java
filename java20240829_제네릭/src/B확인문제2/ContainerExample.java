package B확인문제2;

public class ContainerExample {

	public static void main(String[] args) {

		Containers<String, String> container1 = new Containers<>();
		container1.setName("홍길동", "도적");
		String name = container1.getName();
		String job = container1.getJob();
		System.out.println(name + "," + job);
		
		Containers<String, Integer> container2 = new Containers<>();
		container2.setName("홍길동", 35);
		String name2 = container2.getName();
		int age = container2.getJob();
		System.out.println(name2 + "," + age);
		
	}
}
	class Containers<T, K>{
		
		private T name;
		private K value;
		
		public T getName() {
			return name;
		}
		public K getJob() {
			return value;
		}
		public void setName(T name, K value) {
			this.name = name;
			this.value = value;
		

	}
}
