/**
 * 3 Circle implementation
 */

public class Circle implements Shape {

    Integer radius;

    Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    
    public Integer getRadius() {
        return this.radius;
    }
    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
