package university;

public class Book1 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book1(String name, Author[] authors, double price, int qty) {
        super();
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return name + " " + authors + " " + price + " " + qty;
    }
}
