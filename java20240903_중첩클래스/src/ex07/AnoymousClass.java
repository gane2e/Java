package ex07;

/*
 *  멤버로컬클래스 생성
 */

interface Printable{
	void print();
}


class Papers{
	
	private String message;
	
	public Papers(String message) {
		this.message = message;
	}
	
	public Printable getPrinter() { //반환타입 : Printable -> Printable 구현한 클래스만 반환한다.
	
		/*
		class Printer implements Printable{ //멤버로컬클래스

			@Override
			public void print() {
				System.out.println(message);
			}
		}
		
		 */
		
		
		//익명클래스 , Printable 인터페이스를 구현한 클래스지만 이름이 없는 것
		
		/*
		Printable p = new Printable() { 
			@Override
			public void print() {
				System.out.println(message);
			}
			
		};
		
		return p;
		*/
		
		return new Printable() {

			@Override
			public void print() {
				System.out.println(message);
			}
		};
	}
}


public class AnoymousClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("출력메시지");
		Printable p = papers.getPrinter();
		p.print();
		
	}

}
