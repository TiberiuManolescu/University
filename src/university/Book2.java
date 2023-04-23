package university;

public class Book2 {
    private String name;
    private double price;
    private int qty = 0;

    public Book2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book2(String name ,double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return  "price: " + price + ", " + "qty: " + qty ;
    }
}