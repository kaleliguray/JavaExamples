
public class Apple {

	private String color;
	private int weigth;
	
	public Apple() {
	}
	
	public Apple(String color, int weigth) {
		this.color = color;
		this.weigth = weigth;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getWeigth() {
		return weigth;
	}
	
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	@Override
	public String toString() {
		return color + ", " + weigth;
	}
}
