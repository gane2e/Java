package ex09;

public class TVTest {

	public static void main(String[] args) {

		SaleTV sale = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rental = new RentalTV("RENTALTV-10", 42, 1, 100000);
		
		sale.channelUp();
		sale.channelUp();

		rental.channelDown();
		rental.channelDown();
		rental.channelDown();
		
		TVTest.printAllTV(sale);
		System.out.println("");
		
		TVTest.printAllTV(rental);
		TVTest.printRentalTV(rental);
	}
	
	static void printAllTV(TV tv) {
		
		//Object의 toString을 재정의한것이라 접근가능함
		System.out.println(tv.toString());
		
		//tv가 SaleTV를 참조하거나, SaleTV를 상속한 객체
		//를 참조하는지 체크
		if(tv instanceof SaleTV sale) {
			sale.play();
			sale.sale();
		}
		if(tv instanceof RentalTV rental) {
			rental.play();
		}
		
	}
	static void printRentalTV(Rentable tv) {
			tv.rent();
	}
	
}
