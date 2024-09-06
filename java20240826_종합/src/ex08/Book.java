package ex08;

public class Book extends Item{
	
	private String author;
	private String isbn;
	
	public Book(){}
	public Book(String name, int price, String author, String isbn){
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}
	
	@Override
	 void print() {
			super.print();
			System.out.println("- 저자:" + author + ", isbn:" + isbn);
	}
}
