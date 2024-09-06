package collection;

public class Product {

	private String productID;
	private String productName;
	private String productPrice;
	
	public Product( String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		
	}

	public String getProductID() {
		return productID;
	}
	
	
	public String getProductName() {
		return productName;
	}


	public String getProductPrice() {
		return productPrice;
	}

	@Override
	public int hashCode() {
		return productID.hashCode() ;
	}

	@Override
	public boolean equals(Object obj) {
		
		/*
		obj가 Product 타입일 경우 obj를 Product 타입으로 
		자동 형변환하고 target이라는 이름으로 사용할 수 있게 합니다.
		*/
		if(obj instanceof Product target) {
			return target.productID.equals(productID);
			
			} else {
				return false;
			}
		
	}
}
