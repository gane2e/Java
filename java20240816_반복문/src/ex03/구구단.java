package ex03;

public class 구구단 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=9; i++) {
//			System.out.printf("2 X %d = %d\n", i, 2*i);
//		}
//		System.out.println("------------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.printf("2 X %d = %d\n", i, 3*i);
//		}
//		System.out.println("------------------------");
		
//		for(int i=2; i<=4; i++) { //단
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d X %d = %d\n", i, j, i*j);
//			}
//		}
//			
//		System.out.println("------------------------");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
		}

	for(int i=0; i<5; i++) {
		for(int j=0; j<i; j++) {
			System.out.print(" * ");
		}
		
		System.out.println();
		
	}
	
	
	}

}
