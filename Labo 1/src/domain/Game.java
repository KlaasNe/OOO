package domain;

public class Game extends Product{
    private double price = 5;
    public Game(String title, int id, double price) {
        super(title, id, price);
    }

    @Override
    public double getPrice(int productId, int days) {
        return days * 3;
    }
}
