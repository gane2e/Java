package ex03;

public class CashPayment implements Payment{

	@Override
	public void makePayment(double amouont) {
		System.out.println("현금으로" + amouont + "원을 결제합니다.");
		
	}

	
}
