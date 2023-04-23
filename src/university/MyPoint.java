package university;

public class MyPoint {
    int x = 0;
    int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int x = 10;
        int y = 20;
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return x + y;
    }

    public double distance(MyPoint another) {
        double dx = this.x - another.x;
        double dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public String toString() {
        return "x: " + x + "y: " + y;
    }
}

