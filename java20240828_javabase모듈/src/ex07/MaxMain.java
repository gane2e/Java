//Math 클래스로 최대값 구하기

package ex07;

public class MaxMain {

	public static void main(String[] args) {

		int max = maxFunc(19,116,1290);
		
		
		System.out.println(max);
	}

	static int maxFunc(int n1, int n2, int n3) {
		
		return Math.max(Math.max(n1, n2), n3);
	}
	
}
