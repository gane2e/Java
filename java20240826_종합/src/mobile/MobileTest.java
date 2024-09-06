package mobile;

public class MobileTest {

	public static void main(String[] args) {

		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile otab = new Otab("Otab", 1000, "XYZ-20");
		
		ltab.charge(10);
		otab.charge(10);
		MobileTest.printTitle();
		MobileTest.printMobile(ltab);
		MobileTest.printMobile(otab);
		
		ltab.operate(5);
		otab.operate(5);
		MobileTest.printTitle();
		MobileTest.printMobile(ltab);
		MobileTest.printMobile(otab);
		
		
		
	}
		
		public static void printMobile(Mobile mobile) {
			
			System.out.printf("%s\t %10d\t %10s\t\n", 
					mobile.getMobileName(),
					mobile.getBatterySize(),
					mobile.getOsType());
			
	}
		
		
		public static void printTitle() {
			
			System.out.println("");
			System.out.println("Mobile        Battery          OS");
			System.out.println("------------------------------------");

			
	}

}
