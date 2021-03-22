import java.awt.Graphics2D;

public class Square extends Shape {

	private int length;

	public Square(int posX, int posY, Color color) {
		super(posX, posY, color);
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void draw(Graphics2D graphics2d) {
		switch (getColor()) {
		case BLACK:
			graphics2d.setColor(java.awt.Color.BLACK);
			break;
		case RED:
			graphics2d.setColor(java.awt.Color.RED);
			break;
		case GREEN:
			graphics2d.setColor(java.awt.Color.GREEN);
			break;
		case YELLOW:
			graphics2d.setColor(java.awt.Color.YELLOW);
			break;
		}
		graphics2d.fillRect(getPosX(), getPosY(), length, length);
	}
}
