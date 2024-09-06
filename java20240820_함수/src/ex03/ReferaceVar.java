package ex03;

public class ReferaceVar {

	public static void main(String[] args) {


		int[] arr1=null;  //참조중인 값이 없다는 의미
		int[] arr2;
		int[] arr3;
		
		System.out.println(arr1);

		
		arr1 = new int[] {1, 2 ,3}; //배열{1, 2, 3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1, 2 ,3};	//배열{1, 2, 3}을 생성하고 arr2 변수에 대입
		arr3 = arr2;	//배열 변수 arr2의 값을 배열 변수 arr3에 대입
		
		System.out.println(arr1 ==arr2); //arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 ==arr3);//arr2와 arr3 변수가 같은 배열을 참조하는지 검사
		
		
	}

}
