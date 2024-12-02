public class Circle implements Main.Shape {
    public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

    @Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

    @Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
    @Override
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	@Override
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	@Override
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	
    @Override
	public Main.Shape scale(double k) {
		return new Circle(center, radius * k);
	}

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}

	//Practice: fromPoint
	public static Circle fromPoints(Point p1, Point p2, Point p3) {
		Point midp1p2 = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		double slopep1p2 = (p2.y - p1.y) / (p2.x - p1.x);
		double perpbisecp1p2 = -1 / slopep1p2;
		double intercept1 = midp1p2.y - perpbisecp1p2 * midp1p2.x;
	
		Point midp2p3 = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);
		double slopep2p3 = (p3.y - p2.y) / (p3.x - p2.x);
		double perpbisecp2p3 = -1 / slopep2p3;
		double intercept2 = midp2p3.y - perpbisecp2p3 * midp2p3.x;

		double centerX = (intercept2 - intercept1) / (perpbisecp1p2 - perpbisecp2p3);
		double centerY = perpbisecp1p2 * centerX + intercept1;

		Point center = new Point(centerX, centerY);

		double radius = Math.sqrt(Math.pow(center.x - p1.x, 2) + Math.pow(center.y - p1.y, 2));
	
		return new Circle(center, radius);
	}
}