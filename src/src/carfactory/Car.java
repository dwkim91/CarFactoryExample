package carfactory;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		carNum = ++serialNum;
	}

	public int getCarNum() {
		
		return carNum;
	}
}
