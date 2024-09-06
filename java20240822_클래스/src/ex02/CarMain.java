package ex02;

public class CarMain {

	public static void main(String[] args) {

		
		Car car1 = new Car("K3");
		car1.info();
		
		Car car2 = new Car("G80");
		car2.info();
		
		Car car3 = new Car("Model Y");
		car3.info();
		
		
		Car.showTotalCars();

	}

}
