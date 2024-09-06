package ex08;

public class Album extends Item{
	
	private String artist;
	
	public Album(){}
	public Album(String name, int price, String artist){
		super(name,price);
		this.artist = artist;
	}
	
	@Override
	 void print() {
			super.print();
			System.out.println("- 아티스트:" + artist);
	}
}
