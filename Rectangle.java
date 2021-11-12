/**
 * 3 Rectangle implementation
 */

public class Rectangle implements Shape {

    Integer height;
    Integer width;

    Rectangle(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    public Integer getHeight() {
        return this.height;
    }
    public Integer getWidth() {
        return this.width;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
}
