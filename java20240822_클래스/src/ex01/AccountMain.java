package ex01;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		System.out.println("만원입금");
		account.deposit(10000);
		
		System.out.println("9천원출금");
		account.withdraw(9000);
		
		System.out.println("2천원출금");
		account.withdraw(2000);
		
		System.out.println("잔고 출력");
		System.out.printf("잔액: %d", account.getBalance());

	}

}
