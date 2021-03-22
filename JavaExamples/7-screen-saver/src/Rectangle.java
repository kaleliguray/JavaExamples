import java.awt.Graphics2D;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int posX, int posY, Color color) {
		super(posX, posY, color);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
		graphics2d.drawRect(getPosX(), getPosY(), width, height);
	}

	@Override
	public String toString() {
		return super.toString() + ",Rectangle [width=" + width + ", height=" + height + "]";
	}

}
