package ex05;

public class ArrayEx02 {

	public static void main(String[] args) {


		int[] oldIntArry = {1,2,3};
		
		int[] newIntArray = new int[5];
	
		newIntArray = oldIntArry;
		

		for(int i=0; i<newIntArray.length; i++)
			System.out.println(newIntArray[i]);
		
		oldIntArry[2] = 300;
		for(int i=0; i<oldIntArry.length; i++)
			System.out.println(oldIntArry[i]);
	
		System.out.println("-------------");
	
		//oldIntArray2있는 값을 newIntArray2에 복사
		int[] oldIntArry2 = {1,2,3};
		int[] newIntArray2 = new int[5];
		
		for(int i=0; i<oldIntArry.length; i++)
			newIntArray2[i] = oldIntArry2[i];
		
		oldIntArry[2] = 300;
		for(int i=0; i<oldIntArry.length; i++)
			System.out.println(newIntArray2[i]);
		
		
		System.out.println("-------------");
		
		//oldIntArray2있는 값을 newIntArray2에 복사
		int[] oldIntArry3 = {10,20,30,40,50};
		int[] newIntArray3 = new int[5];
		
		System.arraycopy(oldIntArry3, 0, newIntArray3, 0, oldIntArry3.length);
		//복사
		for(int i=0; i<oldIntArry3.length; i++)
			newIntArray2[i] = oldIntArry3[i];
		
		System.out.println("---");
		
		//출력
		for(int i=0; i<newIntArray3.length; i++)
			System.out.println(newIntArray3[i]);
		
		System.out.println("---");
		
		//출력2
		for(int n : newIntArray3)
		System.out.println(n);
		
		String[] str = {"java", "spring", "python", "javascript"};
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
			
		System.out.println("---");
		
		for(String s : str)
			System.out.println(s);
			
			
	}

}
