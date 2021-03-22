import java.awt.Graphics2D;

public abstract class Shape {

	private int posX;
	private int posY;
	private Color color;
	
	public Shape(int posX, int posY, Color color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw(Graphics2D graphics2d);

	@Override
	public String toString() {
		return "Shape [posX=" + posX + ", posY=" + posY + ", color=" + color + "]";
	}
	
	
}
