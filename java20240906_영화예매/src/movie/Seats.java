package movie;

import java.util.ArrayList;

public class Seats { 
	
	//좌석표
	public static final int MAX_ROW = 5;
	public static final int MAX_COL = 9;
	
	private String[][]map = new String[MAX_ROW][MAX_COL];
	
	public Seats(ArrayList<Reservation> reservations) throws Exception {
		
		for(int i=0; i<MAX_COL; i++) {
			for(int j=0; j<MAX_COL; j++) {
				map[i][j] = "O";
			}
		}
		
		//B-4, A-4
		for(int i=0; i<reservations.size(); i++) {
			Reservation r = reservations.get(i);
			String seatName = r.getSeatName();
			mark(seatName);
		}
		
	}//좌석표 끝

	//좌석마킹
	public void mark(String seatName) throws Exception {
		
		char[] temp = seatName.toCharArray();
		
		int row = temp[0] - 'A' ; //행 인덱스 계산 66-65 B(66)-A(65)=1
		int col = temp[2] - '1' ; //열 인덱스 계산 '4'(52)-'1'(49)=3
		
		if("X".equals(map[row][col])) {
			throw new Exception("이미 예약된 좌석입니다.");
		}
		map[row][col] = "X"; //예매 좌석 확정
	}

	public void show() {
		
		System.out.println("----------------------------------");
		System.out.println("         S  C  R  E  E  N         ");
		System.out.println("----------------------------------");
		
		for(int i=0; i<MAX_COL; i++) {
			System.out.printf("%c ", 'A'+i);
			for(int j=0; j<MAX_COL; j++) {
				System.out.printf(" %s", map[i][j]);
			}
			System.out.println();
		}
		System.out.println("    1 2 3 4 5 6 7 8 9");
	}
	

}
