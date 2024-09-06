package ex07;

public class BankMain {

	public static void main(String[] args) {
		
		Banking person = new Banking();
		
		person.계좌번호 = "111-2222-3333";		
		person.소유자이름 = "길동이";
		person.입금(10000);
		person.출금(3000);
		person.잔액();
		person.info();
	}

	
}
class Banking{ // 클래스명 첫글자 = 대문자 , 변수 및 함수는 소문자
	
	String 계좌번호;
	String 소유자이름;
	int 잔액;
		
	void 입금(int money) {
		잔액 += money;
		System.out.println("입금 : " + money);
		}
	void 출금(int money) {
		잔액 -= money;
		System.out.println("출금 : " + money);
		}
	void 잔액() {
		System.out.println("잔액 : " + 잔액);
	}
	void info() {
		System.out.printf("계좌번호 : %s, 소유자 이름: %s, 잔액 : %d\n ", 계좌번호, 소유자이름, 잔액);
	}

}
