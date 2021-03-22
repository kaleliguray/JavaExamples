// POJO (Plain old java objects)
// Java Beans
// DTO (Data Transfer Object)

public class Position {

	private int x;
	private int y;

	public Position() {
		System.out.println("ctor");
	}

	public Position(int a, int b) {
		this.x = a;
		this.y = b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
