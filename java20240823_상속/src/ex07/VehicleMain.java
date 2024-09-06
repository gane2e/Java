package ex07;

public class VehicleMain {

	public static void main(String[] args) {

		////차량 번호: 123가 4567
		////소유자: 홍길동
		////차량이 시동을 걸었습니다.
		////연료 타입: Gasoline
		////탑승 인원: 5
		////정비 비용: 50000.0원
		////
		////차량 번호: 789나 1011
		////소유자: 이순신
		////차량이 시동을 걸었습니다.
		////적재 용량: 10.0톤
		//정비 비용: 200000.0원

		Vehicle car = new Car
				("789나 1011", "이순신", "Gasoline", 5);
	     car.info();
	     
	    System.out.println("---------------------");
	     
		Vehicle truck = new Truck("123가 4567", "홍길동", 10.0);
		truck.info();

	     
			
	}

}
