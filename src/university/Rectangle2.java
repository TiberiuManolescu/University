package university;

public class Rectangle2 {
    private double width;
    private double length;
    private String color;
    private boolean filled;

    public Rectangle2() {
        this.width = 1.0;
        this.length = 1.0;
        this.color = "white";
        this.filled = false;
    }

    public Rectangle2(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle with width = " + width + ", length = " + length + ", color = " + color + ", filled = " + filled;
    }
}
