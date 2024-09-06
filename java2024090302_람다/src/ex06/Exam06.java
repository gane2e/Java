package ex06;

@FunctionalInterface
interface TriFunction<T,M,R,Q>{
	public Q apply(T n1, M n2, R n3);
}

public class Exam06 {

	public static void main(String[] args) {
		
//		TriFunction<String, Integer, Integer, Integer> tri = (n1, n2, n3) -> String.valueOf("" + n1 + n2 + n3);

	}

}
