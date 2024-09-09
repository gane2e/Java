package movie;

import java.util.ArrayList;
import java.util.List;

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
		
		//영화예매
		case "1" :
			reserve();
			return this;
		//예매확인
		case "2" : 
			checkReservation(); 
			return this;
		//예매취소
		case "3" :
			cancelReservation(); 
			return this;
		//관리자메뉴 이용
		case "4" : 
			if(! checkAdminPassWord()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
				return this;
			} 
			//메인메뉴 인스턴스에서 어드민메뉴 인스턴스 생성
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			return adminMenu;
		
		case "q" : return prevMenu;
		default : return this;
		}
		
	}
	
	// case "1" 영화예매 //
	private void reserve() {
		
		try {
			List<Movie> movies = Movie.findAll(); // <<영화 목록 보여주기
			
			for(Movie movie : movies)
				System.out.println(movie);
			
			System.out.println("예매할 영화를 선택하세요: ");
			String movieId = sc.nextLine();
			Movie movie = Movie.findAll(movieId); //<<예매 영화 선택
			
			
			//예매된 영화 좌석 현황 출력
			ArrayList<Reservation> reservations = 
					Reservation.findMovieId(movieId);
			Seats seats = new Seats(reservations);
		
			seats.show(); //예약좌석 및 빈 좌석 조회
			
			System.out.println("좌석을 선택하세요(예:E-5)");
			String seatName = sc.nextLine();
			
			seats.mark(seatName); //좌석 예매 하는 코드
			
			//예매 객체 생성 및 저장
			Reservation reservation = 
					new Reservation( movie.getId(), movie.getTitle(), seatName);
			
			reservation.save();
			System.out.println(">> 예매가 완료되었습니다.");
			System.out.printf(">> 발급 번호: %d\n", reservation.getId());
			
			
		} catch (Exception e) {
			System.out.printf("예매에 실패하였습니다: %s\n", e.getMessage());
		}
	}

	// case "2" 예매확인 //
	private void checkReservation() {
		System.out.println("예매번호를 입력하세요: ");
		
		try {
			Reservation reservation = Reservation.findById(sc.nextLine());
			
			if(reservation == null) {
				System.out.println(">>예매 내역이 없습니다.");
			}else {
				System.out.println(">>[확인 완료]\n" + reservation);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// case "3" 예매취소
	private void cancelReservation() {
		
		System.out.println("예매번호를 입력하세요 : "); 
		Reservation canceled = Reservation.delete(sc.nextLine());	
		
		if(canceled == null) {
			System.out.println("예매 내역이 없습니다.");
		} else {
			System.out.printf(">>[취소완료] %s의 예매가 취소되었습니다.", canceled);
		}
		System.out.println("");
	}

	// case "4" 관리자 메뉴로 이용
	private boolean checkAdminPassWord() {
		System.out.println("관리자 비밀번호를 입력하세요.");
		return "1234".equals(sc.nextLine());
	}
			
}
