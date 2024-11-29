public class PracticeProblems {
    //Center of Mass Practice
    public static Point centerOfMass(Point[] points) {
        if (points.length == 0) {
            return null;
        }
        double totalX = 0;
        double totalY = 0;
        for (Point p: points) {
            totalX += p.x;
            totalY += p.y;
        }
        double sumX = 0;
        double sumY = 0;
        for (int i = 0; i < points.length; i++) {
          sumX = sumX + points[i].x;
          sumY = sumY + points[i].y;
        }
        double averageX = (sumX / points.length);
        double averageY = (sumY / points.length);
        return new Point(averageX, averageY);
    }

}
