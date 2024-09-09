package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation { // 예매 클래스

	private long id;
	private long movieId;
	private String movieTitle;
	private String SeatName;
	
	private static final File file = new File("src/movie/reservation.txt");
	
	public String getSeatName() {
		return SeatName;
	}
	

	public long getId() {
		return id;
	}


	//
	public Reservation(long movieId, String movieTitle, String SeatName) {
		
	      this(Instant.now().toEpochMilli(), movieId,movieTitle ,SeatName);
	      
	   }
	
	//생성자
	public Reservation(long id, long movieId, String movieTitle, String SeatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.SeatName = SeatName;
	}
	
	//입력한 예매번호의 영화 예매확인
	public static Reservation findById(String reservationId) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			//src/movie/reservation.txt"파일 버퍼리더를 파일리더로 초기화
			br = new BufferedReader(new FileReader(file));
			
			//버퍼리더로 한 줄씩 읽어서 line에 저장 ,null값이 되면 종료
			while((line = br.readLine()) != null) {
				
				//line에 저장한 글자를 , 기준으로 temp에 저장
				String[] temp = line.split(",");
				
				//입력 한 reservationId가 temp[0]과 동일하면 reservation 객체생성
				if(reservationId.equals(temp[0])) { 
					reservation = new Reservation (
							Long.parseLong(temp[0]), 
							Long.parseLong(temp[1]),
							temp[2],
							temp[3]
							);
					break;
				}
			}
			br.close(); //파일 내에서 예매번호와 동일한 정보를 찾아서 객체를 생성 후 버퍼리더 종료
			return reservation; //생성한 객체 리턴
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public String toString() {
//		return "영화 명: " + movieTitle+ "\n좌석번호: " + SeatName ;
		return String.format("영화:%s\n좌석:%s\n", movieTitle, SeatName );
	}

	
	//예매취소
	public static Reservation delete(String reservationID) {
	
	Reservation reservation = null;
	BufferedReader bf = null;
	StringBuilder text = new StringBuilder();
	String line = null;
			
	
	try {
		
		bf = new BufferedReader(new FileReader(file)); //reservation.txt 읽어서 buffer 저장

		//버퍼리더로 한 줄씩 읽어서 line에 저장 ,null값이 되면 종료
		while( (line = bf.readLine() ) != null ) {
			
			String[] temp = line.split(",");
			
			//reservationID랑 temp[0]이 동일하면 해당 객체를 생성 후 제외, temp[0]이 동일하지 않은 인스턴스만 line에 저장
			if(reservationID.equals(temp[0])) { 
				 reservation = new Reservation(Long.parseLong(temp[0]),Long.parseLong(temp[1]),
						temp[2],temp[3]);
				 
				 continue;
				}
				text.append(line+"\n"); //text += line + "\n"; --> 이것 대체
			
		}	
		
		bf.close();
		
		FileWriter fw = new FileWriter(file);
		fw.write(text.toString());
		
		fw.close();
		return reservation;
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
	return null;
	}

	
	//예매된 영화 좌석 현황 출력
	//movieId (영화ID) 해당하는 예약 현황을 보여죠!
	public static ArrayList<Reservation> findMovieId(String movieId) {
		
		ArrayList<Reservation> reservations = new ArrayList<>();
		
		BufferedReader bf = null;
		String line = null;
		try {
			bf = new BufferedReader(new FileReader(file));
			while((line = bf.readLine()) != null) {
				
				String[] temp = line.split(",");
				if(movieId.equals(temp[1])) {
					
					reservations.add(new Reservation(
							 Long.parseLong(temp[0]),
							 Long.parseLong(temp[1]),
									 temp[2],
									 temp[3]
							));
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return reservations;

	}

	public void save() throws IOException {
		
		FileWriter fw = new FileWriter(file,true);
		fw.write(this.toFileString() + "\n");
		fw.close();
	}


	private String toFileString() {
		return String.format("%d,%d,%s,%s",id,movieId,movieTitle,SeatName);
	}


}
