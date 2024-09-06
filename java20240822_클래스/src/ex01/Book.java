package ex01;

public class Book {
	
	private String title;
	private String author;
	private int page;

	Book(){
		this("기본1", "기본2", 000000);//맨첫줄에작성해야함
	}

	Book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	Book(String title, String author){

		this(title, author, 000000);

	}
	void displayInfo() {
		System.out.printf("제목 : %s, 저자 : %s, 페이지 : %d\n" ,title ,author ,page);
	}
	

}
