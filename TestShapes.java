/**
 * Tests provided for 3
 */

public class TestShapes {
    public static void main(String[] args) {
        Circle c = new Circle(4); // Radius of 4
        Rectangle r = new Rectangle(4,3); // Height = 4, Width = 3
        ShowArea(c);
        ShowArea(r);
    }

    public static void ShowArea(Shape s) {
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}
