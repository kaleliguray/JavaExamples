
public final class Square extends Shape {

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Square Lentgh:" + length);
	}
	
	@Override
	public final String toString() {
		return super.toString() + ",Length:" + length;
	}
}
