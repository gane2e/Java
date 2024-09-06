package ex02;

public class Car {
	
	private String car;
	static int count=0;
	
	Car(){	}
	Car(String car){
		this.car = car;
		count++;
	}
	
	void info(){
		System.out.println("차량 구입, 이름 : " + car);
	}
	
	static void showTotalCars(){
		System.out.println("구매한 차량 수 :" + count);
	}

}
