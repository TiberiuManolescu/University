package university;

public class Square {
    private double side = 3.8;
    public String color = "blue";
    public boolean filled = false;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
    }

    public void setLength(double side) {
    }

    public String toString() {
        return "Square with side = " + side + ", color = " + color + ", filled = " + filled ;
    }
}
