package observer;

public class Reactor extends Observable<Integer> {

	public static final int DEFAULT_MAX_TEMPERATURE = 100;
	
	private int temperature;
	private int maxTemperature = DEFAULT_MAX_TEMPERATURE;
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		if (this.temperature >= this.maxTemperature) {
			notifyObservers(this.temperature);
		}
	}
	
	public int getMaxTemperature() {
		return maxTemperature;
	}
	
	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
}
