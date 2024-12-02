import java.util.ArrayList;

public class Main {
    public interface Shape {
        public double area();
        public double perimeter();
        public boolean isInside(Point p);
        public boolean isOn(Point p);
        public Shape translate(double x, double y);
        public Shape scale(double k);
    }

    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape: shapes) {
            sum += shape.area();
        }
        return sum;
    }

    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }

    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + " y: " + point.y);
        Point xTranslation = point.translateX(3);
        Point yTranslation = point.translateY(-7);
        Point xyTranslation = point.translateX(-4).translateY(-3);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);


        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World"); 
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);
        
        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add("Hello".equals(arr.get(0)));
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));


        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);

        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));


        Shape[] scaledShapes = scaleAll(shapes, 2);
        System.out.println("Scaled Shapes:");
        for (Shape shape : scaledShapes) {
            System.out.println(shape);
        }
    }

    //Practice: Right Triangle
    public static class RightTriangle implements Shape {
        private final Point corner;
        private final double base;
        private final double height;

        public RightTriangle(Point corner, double base, double height) {
            this.corner = corner;
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return (base * height) / 2;
        }

        @Override
        public double perimeter() {
            double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
            return base + height + hypotenuse;
        }

        @Override
        public boolean isInside(Point p) {
            double x = p.x - corner.x;
            double y = p.y - corner.y;
            return (x >= 0 && x <= base) && (y >= 0 && y <= height) && (x + y <= base);
        }

        @Override
        public boolean isOn(Point p) {
            double x = p.x - corner.x;
            double y = p.y - corner.y;
            return (x == 0 || x == base) || (y == 0 || y == height) || (x + y == base);
        }

        @Override
        public Shape translate(double x, double y) {
            return new RightTriangle(new Point(corner.x + x, corner.y + y), base, height);
        }

        @Override
        public Shape scale(double k) {
            return new RightTriangle(corner, base * k, height * k);
        }

        public static boolean similar(RightTriangle t1, RightTriangle t2) {
            return (t1.base / t2.base) == (t1.height / t2.height);
        }
    }

    //Practice: returnAll
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }

    //Practice: availableItems
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItemsList = new ArrayList<>();
        for (LibraryItem item: items) {
          if (item.available()) {
            availableItemsList.add(item);
          }
        }
        return availableItemsList;
      }
}