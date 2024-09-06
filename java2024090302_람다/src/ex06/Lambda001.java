package ex06;

interface BBB {
	int max (int a, int b);
}

public class Lambda001 {

	public static void main(String[] args) {

			BBB max = (a,b) -> a > b ? a : b;
			
				System.out.println(max.max(1, 10));
				
	}
}


