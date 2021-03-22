public class Point {
	
	int x;
	int y;

	public double distance(Point other) {
		double xDiff = Math.pow(other.x - this.x, 2);
		double yDiff = Math.pow(other.y - this.y, 2);
		return Math.sqrt(xDiff + yDiff);
	}
	
	public static void main(String[] args) {
		Point pointA = new Point();
		pointA.x = 5;
		pointA.y = 2;
		
		Point pointB = new Point();
		pointB.x = 8;
		pointB.y = 6;
		
		
		System.out.println(pointA.distance(pointB));
	}

}