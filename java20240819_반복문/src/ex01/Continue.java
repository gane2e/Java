package ex01;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1; 1<=10; i++) {
			if(i % 2 == 1 || i%3 == 0 ) continue; //아래 식 실행하지 않음
			System.out.print(i + ", ");
		}
	}

}
