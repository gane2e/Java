//2차원 배열 입력 및 출력

package ex05;

public class ArrayEx03 {

	public static void main(String[] args) {


		int[][] kor = {
				{80, 81, 82, 83, 84} ,
				{90, 91, 92, 93, 94} ,
				{70, 71, 72, 73, 74}
		};

		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++)
				System.out.print(kor[i][j] + ", ");
			System.out.println();
		}
		
			
	}

}
