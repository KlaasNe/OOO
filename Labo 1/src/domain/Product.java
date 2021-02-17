package domain;

public abstract class Product {

    private String title, type;
    private int id;
    private double price;

    public Product(String title, int id, double price) {
        this.title = title;
        this.id = id;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double getPrice(int productId, int days);
}
