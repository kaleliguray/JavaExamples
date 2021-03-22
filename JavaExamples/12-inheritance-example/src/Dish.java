
public class Dish extends Animal {

	private int sizeInFeet;
	private boolean canEat;
	
	public int getSizeInFeet() {
		return sizeInFeet;
	}
	
	public void setSizeInFeet(int sizeInFeet) {
		this.sizeInFeet = sizeInFeet;
	}
	
	public boolean isCanEat() {
		return canEat;
	}
	
	public void setCanEat(boolean canEat) {
		this.canEat = canEat;
	}
	
	@Override
	public void mate() {
		// TODO Auto-generated method stub
	}
	
	public void swim() {
	}

}
