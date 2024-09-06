package ex07;

public class Truck extends Vehicle{

	double loadCapacity;//적재용량
	
	public Truck(String licensePlate, String owner,double loadCapacity){
		super(licensePlate,owner);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	 double calculateMaintenanceCost()  {
		 return loadCapacity*20000.0;
	}
	
	@Override
	public void info() {
		
		super.info();
		super.startEngine();
		System.out.println("적재용량 : " + loadCapacity + "톤");
		System.out.println("정비비용 : " + calculateMaintenanceCost() + "원");

	}
	
	
}
