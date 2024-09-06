package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
   
   private long id;  //영화 고유 번호
   private String title;  //영화 제목
   private String genre; //영화 장르
   
   //파일을 참조하는 경로를 만들어줌
   private static final File file = 
         new File("src/movie/movies.txt");
   
   
   public Movie(String title, String genre ) {
	      this.id = Instant.now().getEpochSecond();
	      this.title = title;
	      this.genre = genre;
	   }
   
   public Movie(long id, String title, String genre ) {
      this.id = id;
      this.title = title;
      this.genre = genre;
   }
   
   //파일추가
   public void save() throws IOException {
	   
	   FileWriter fw = new FileWriter(file, true); //true -> append (끝에 추가한다)
	   
	   //file에 덮어씀
	   fw.write(this.toFileString() + "\n");
	   fw.close();
   }
   
   
   private String toFileString() {
	return String.format("%d,%s,%s",id,title,genre);
}

public static ArrayList<Movie> findAll() throws IOException {
      
	   //Movie 객체 생성해서 배열로 저장
      ArrayList<Movie> movies = new ArrayList<Movie>();
      
      BufferedReader br = null;
      String line = null;
      
      try {
    	  
         // 버퍼가 파일 읽어줌, 한줄씩
    	 // 파일리더 -> 한자씩 일겅줌
         br = new BufferedReader(new FileReader(file));
         
         // 리드라인으로 한줄씩 읽어서 line에 저장 / 마지막엔 null값
         while( (line = br.readLine()) != null) {
            String[] temp = line.split(",");  
            
            /*
             * temp[0] -> "1627175707"
             * temp[1] -> 에벤져스
             * temp[2] -> 판타지
             * 
             */
   
            Movie movie = //long은 정수여서 변환해줌
                  new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
            //생성한 movie객체를 배열로 하나씩 저장
            
            
            movies.add(movie);   
         }
         
      }catch(FileNotFoundException e) {
         e.printStackTrace();
      }catch(Exception e) {
         e.printStackTrace();
      }
      br.close();
      return movies;
   }
   
   public String toString() {
      return String.format("[%d] : %s(%s)", id, title, genre);
   } 
}























