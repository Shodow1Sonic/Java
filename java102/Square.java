public class Square implements Main.Shape {
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

    @Override
	public double area() {
		return Math.pow(sideLength, 2);
	}
	
	@Override
	public double perimeter() {
		return sideLength * 4;
	}
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	@Override
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	@Override
    public boolean isOn(Point p) {
        return (p.x == corner.x && corner.y <= p.y && p.y <= corner.y + sideLength) ||               // Left Edge
               (p.x == corner.x + sideLength && corner.y <= p.y && p.y <= corner.y + sideLength) ||  // Right Edge
               (p.y == corner.y && corner.x <= p.x && p.x <= corner.x + sideLength) ||               // Bottom Edge
               (p.y == corner.y + sideLength && corner.x <= p.x && p.x <= corner.x + sideLength);    // Top Edge
    }
	
	/** 
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	@Override
	public Square translate(double x, double y) {
		return new Square(corner.translateX(x).translateY(y), sideLength);
	}

	/** 
	* @return The sqaure that results from scaling the side length and maintaining the bottom left corner
	*/

	@Override
	public Main.Shape scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = corner;                                                   //Bottom Left Corner
        corners[1] = new Point(corner.x + sideLength, corner.y);               //Bottom Right Corner
        corners[2] = new Point(corner.x, corner.y + sideLength);               //Top Left Corner
        corners[3] = new Point(corner.x + sideLength, corner.y + sideLength);  //Top Right Corner
        return corners;
	}

	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
}