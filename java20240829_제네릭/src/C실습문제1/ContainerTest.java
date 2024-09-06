package C실습문제1;

public class ContainerTest {

	public static void main(String[] args) {

		Container<String> stringContainer = new Container<>();
		System.out.println("빈 값 확인 : " + stringContainer.isEmpty());
		
		stringContainer.setItem("data1");
		System.out.println("저장 데이터 : " + stringContainer.getItem());
		
	}
		
}

	
