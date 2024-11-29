public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + " y: " + point.y);
        Point xTranslation = point.translateX(3);
        Point yTranslation = point.translateY(-7);
        Point xyTranslation = point.translateX(-4).translateY(-3);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
    }
}
