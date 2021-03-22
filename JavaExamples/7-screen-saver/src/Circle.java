import java.awt.Graphics2D;

public class Circle extends Shape{

	private int radius;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw(Graphics2D graphics2d) {
		graphics2d.drawOval(getPosX(), getPosY(), radius, radius);
	}

}
