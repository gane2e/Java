package ex09;


public class SaleTV extends TV {

	private int price;
	
	public SaleTV(){}
	public SaleTV(String model, int size, int channel, int price) {
		super(model,size,channel);
		this.price = price;
	}
	
	public void play() {
		System.out.println("판매TV 채널 " + getChannel() + "번의 프로를 플레이 합니다.");
	}
	public void sale() {
		System.out.println(getModel() + " 모델의 상품을 판매합니다." + String.format("%,8d",price) + "원을 지불해주세요.");
	}
	
	public String toString() {
		return "판매상품정보 : 모델명("+ getModel()+"), 가격("+ String.format("%,d",price) +"원), 크기("+getSize()+")";
	}
	
	
}
