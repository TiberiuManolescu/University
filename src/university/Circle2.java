package university;

public class Circle2 {
    private int radius = 3;
    private String color = "red";
    private boolean filled = true;

    public Circle2() {
    }

    public Circle2(int radius) {
        this.radius = radius;
    }

    public Circle2(int radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return radius + color + filled;
    }
}