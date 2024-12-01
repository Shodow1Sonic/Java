public class PointPractice {
    //Practice: Center of Mass
    public static Point centerOfMass(Point[] points) {
        if (points.length == 0) {
            return null;
        }
        double sumX = 0;
        double sumY = 0;
        for (Point point : points) {
            sumX = sumX + point.x;
            sumY = sumY + point.y;
        }
        double averageX = (sumX / points.length);
        double averageY = (sumY / points.length);
        return new Point(averageX, averageY);
    }

    //Practice: Angle
    private double y; //added to avoid errors
    private double x; //added to avoid errors
    public double angle() {
        double rad = Math.atan2(this.y, this.x);
        double degrees = Math.toDegrees(rad);
        return degrees;
    }

    //Challenge: Rotation
    public Point rotate(double theta) {
        double rad = Math.toRadians(theta);
        double newx = x * Math.cos(rad) - y * Math.sin(rad);
        double newy = x * Math.sin(rad) + y * Math.cos(rad);
        return new Point(newx, newy);
    }
}
