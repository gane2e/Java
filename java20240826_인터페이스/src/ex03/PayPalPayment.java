package ex03;

public class PayPalPayment implements Payment{
	
private double amouont;
	
	@Override
	public void makePayment(double amouont) {
		System.out.println("Paypal로" + amouont + "원을 결제합니다.");
	
}

}
