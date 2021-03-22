package observer;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		Reactor reactor = new Reactor();
		reactor.addObserver(new CoolingFan());
		reactor.addObserver(new AlarmBuzzer());

		for (int i = 60; i <= 100; i++) {
			reactor.setTemperature(i);
			System.out.println("Temp is : " + i);
			Thread.sleep(250);
		}
	}
}
