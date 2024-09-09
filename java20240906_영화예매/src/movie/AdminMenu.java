package movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminMenu extends AbstractMenu {

	private static final AdminMenu instance = new AdminMenu(null);

	private static final String MAIN_MENU_TEXT = //기본문구
			"1. 영화 등록 하기\n" + 
			"2. 영화 목록 보기\n" + 
			"3. 영화 삭제 하기\n" + 
			"b. 메인 메뉴로 이동\n" + 
			"메뉴를 선택하세요: ";
			
	AdminMenu(Menu prevMenu){
		super(MAIN_MENU_TEXT,prevMenu);
	}
	
	//정적메서드로 호출하기위해 static 선언
	public static AdminMenu getInstance() {
		return instance;	//MainMenu 객체 셍성 주소반환 (싱글톤 패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		//영화 등록
		case "1" : 
			createMovies();
			return this;
		//영화 목록 출력
		case "2" : 
			printAllMovies(); 
			return this;
		//영화 삭제
		case "3" : 
			deletMovie();
			return this;
			//이전 메뉴
			case "b" : return prevMenu;
			default : return this;
		}
	}
	
	// case "1" 영화 등록
	private void createMovies() {
		
		System.out.println("제목 : ");
		String title = sc.nextLine(); //제목입력
		
		System.out.println("장르 : ");
		String genre = sc.nextLine(); //장르입력
		
		Movie movie = new Movie(title, genre);
		
		try {
			movie.save();
			System.out.println(">> 등록이 완료되었습니다.");
		} catch (IOException e) {
			System.out.println(">> 등록이 실패하였습니다.");
		}
		
	}
	
	// case "2" 영화 목록 출력
	private void printAllMovies() {
		try {
			List<Movie> movies = Movie.findAll();
			System.out.println();
			
			for(Movie movie : movies) 
				System.out.printf("%s\n", movie);
			
		} catch (Exception e) {
			System.out.println("데이터 접근에 실패하였습니다.");
		}
	}
	
	// case "3" 영화 삭제
	private void deletMovie() {
		printAllMovies();
		System.out.println("삭제할 영화의 ID값을 입력하세요 : "); //1725842136 입력
		Movie.delete(sc.nextLine());	//Movie.delete(1725842136); --> 함수 호출
		System.out.println(">> 삭제되었습니다.");
	}


	
	
}
