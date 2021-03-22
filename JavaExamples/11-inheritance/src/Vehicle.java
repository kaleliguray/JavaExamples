
public abstract class Vehicle {

	private int speed;
	private PowerSource powerSource;

	public Vehicle(PowerSource powerSource) {
		this.powerSource = powerSource;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public PowerSource getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(PowerSource powerSource) {
		this.powerSource = powerSource;
	}

	public abstract void accelerate();

	public abstract void breaks();
}
