package carfactory;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car mymySonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());//10001
		System.out.println(yourSonata.getCarNum());//10002
		System.out.println(mymySonata.getCarNum());//10003
	}

}
