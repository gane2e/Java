package C실습문제2;

public class PairTest {

	public static void main(String[] args) {

		Pair<Integer, String> pair1 = new Pair<>();
		
		pair1.setFisrt(1);
		pair1.setSecond("data");
		System.out.println(pair1.getFisrt());
		System.out.println(pair1.getSecond());
		System.out.println("pair1 = " + pair1);
		
		
		System.out.println("----------------------------------------");
		Pair<String, String> pair2 = new Pair<>();
		
		pair2.setFisrt("key");
		pair2.setSecond("value");
		System.out.println(pair2.getFisrt());
		System.out.println(pair2.getSecond());
		System.out.println("pair2 = " + pair2);
		
	}

}
