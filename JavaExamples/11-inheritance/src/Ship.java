
public class Ship extends Vehicle {

	public Ship(PowerSource powerSource) {
		super(powerSource);
	}

	@Override
	public void accelerate() {
		System.out.println("Pervane döndürüldü");
	}

	@Override
	public void breaks() {
		System.out.println("Pervane ters yöne döndürüldü");
	}

}
