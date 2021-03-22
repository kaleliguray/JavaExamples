
public class Car extends Vehicle {

	public Car(PowerSource powerSource) {
		super(powerSource);
	}

	@Override
	public void accelerate() {
		System.out.println("Gaz pedalına basıldı");
	}

	@Override
	public void breaks() {
		System.out.println("Fren pedalına basıldı");
	}

}
