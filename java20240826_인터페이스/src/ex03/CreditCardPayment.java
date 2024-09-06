package ex03;

public class CreditCardPayment implements Payment{

	@Override
	public void makePayment(double amouont) {
		System.out.println("신용카드로" + amouont + "원을 결제합니다.");
		
	}
	
	
	

}
