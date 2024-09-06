package ex01;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.displayInfo();
		
		Book book2 = new Book("Java","Seo");
		book2.displayInfo();
		
		Book book3 = new Book("Python","kim",200);
		book3.displayInfo();
	}

}
