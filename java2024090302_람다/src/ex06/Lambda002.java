package ex06;

interface CCC {
	void printVar (String name, int i);
}

public class Lambda002 {

	public static void main(String[] args) {

		CCC ccc = (name,i) -> System.out.println(name+"="+i);
			
				ccc.printVar("dsd", 20);
	}
}


