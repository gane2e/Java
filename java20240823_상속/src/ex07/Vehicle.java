package ex07;

public class Vehicle {

	String licensePlate;
	String owner;
	
	Vehicle(String licensePlate, String owner){
		this.licensePlate = licensePlate;//차량 번호
		this.owner = owner;//소유쟈
	}
	
	void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	 double calculateMaintenanceCost()  {
		 return 0;
	}
	
	
	public void info() {
		System.out.printf("차량번호 : %s\n소유자 : %s\n", licensePlate,owner);
	}
	
}
