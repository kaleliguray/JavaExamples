
public class Driver {

	
	public static void main(String[] args) {
		Car car = new Car(PowerSource.ELECT);
		car.setSpeed(0);
		car.accelerate();
		car.breaks();
		
		
		Ship ship = new Ship(PowerSource.OIL);
		ship.setSpeed(0);
		ship.accelerate();
		ship.breaks();
	}
}
