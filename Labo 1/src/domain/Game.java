package src.domain;

public class Game extends Product{

    private final double price = 5;
    public Game(String title, int id, double price) {
        super(title, id, price);
    }

    @Override
    public double getPrice(int days) {
        return days * 3;
    }
}
