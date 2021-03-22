package observer;

public class CoolingFan implements Observer<Integer> {

	@Override
	public void onUpdate(Integer data) {
		System.out.println("Fan start working");
	}

}
