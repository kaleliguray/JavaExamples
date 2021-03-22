package observer;

public class AlarmBuzzer implements Observer<Integer>{

	@Override
	public void onUpdate(Integer data) {
		System.out.println("Alarm buzzer started");
	}

}
