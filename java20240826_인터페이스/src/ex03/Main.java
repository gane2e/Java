package ex03;

public class Main {

	public static void main(String[] args) {

		Payment payment = new CreditCardPayment();
		payment.makePayment(10000);
		
		payment = new CashPayment();
		payment.makePayment(5000);
		
		payment = new PayPalPayment();
		payment.makePayment(3000);
		
	}

}
