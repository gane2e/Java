package movie;

public class MainMenu extends AbstractMenu{
	
	private static final MainMenu instance = new MainMenu(null);

	private static final String MAIN_MENU_TEXT = //기본문구
			"1. 영화 예매하기\n" + 
			"2. 예매 확인하기\n" + 
			"3. 예매 취소하기\n" + 
			"4. 관리자 메뉴로 이용하기\n" + 
			"q. 종료\n\n" + 
			"메뉴를 선택하세요: ";
	
	//preMenu =>null
	//외부에서 객체생성불가한 싱글톤 사용하려고 private 사용
	//화면전환할 때 싱글톤이 매끄럽게 사용
	//객체를 여러 개 생성하면 코드 애매
	private MainMenu(Menu preMenu) {
		super(MAIN_MENU_TEXT, preMenu); //부모생성자 호출
	}
	
	//정적메서드로 호출하기위해 static 선언
	public static MainMenu getInstance() {
		return instance;				//MainMenu 객체 셍성 주소반환 (싱글톤 패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "4" : 
			if(! checkAdminPassWord()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
				return this;
			} 
			//메인메뉴 인스턴스에서 어드민메뉴 인스턴스 생성
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			return adminMenu
;
		
		case "q" : return prevMenu;
		default : return this;
		}
		
		
	}

	private boolean checkAdminPassWord() {
		System.out.println("관리자 비밀번호를 입력하세요.");
		return "1234".equals(sc.nextLine());
	}
			
}
