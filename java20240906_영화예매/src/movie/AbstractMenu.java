package movie;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu{

	protected String menuText; //기본 문구
	protected Menu prevMenu;   
	protected static final Scanner sc = new Scanner(System.in);
	//상수를 선언하는 것은 변하지 않고 계속 일관된 값을 사용하기 위함이다.
	//(데이터와 그 의미, 용도를 고정)
	//만약 상수를 static으로 선언하지 않은 경우, 클래스의 모든 인스턴스에 해당 상수에 대한 메모리를 할당한다
	
	AbstractMenu(String menuText, Menu prevMenu){
		this.menuText = menuText;
		this.prevMenu = prevMenu;		
	}
	
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}


	@Override
	public void print() {
		System.out.println("\n" +  menuText); //메인메뉴 출력
	}

	@Override
	public Menu next() {
		return null;
	}

}
