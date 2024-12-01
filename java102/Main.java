import java.util.ArrayList;

public class Main {
    public interface Shape {
        double area();
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



    }
    

}
