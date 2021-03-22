
public class Calculator {
	
	public static final float PI = 3.14f;
	
	private Calculator() {
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int minus(int x, int y) {
		return x - y;
	}
	
	public static int multiple(int x, int y) {
		return x * y;
	}
	
	public static float divide(int x, int y) {
		return (float)x / y;
	}
}
