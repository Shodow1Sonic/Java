public class Point {
	public final double x;
    public final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point translateX(double a) {
        return new Point(x + a, y);
    }
    public Point translateY(double b) {
        return new Point(x, y + b);
    }
    @Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
    public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
}