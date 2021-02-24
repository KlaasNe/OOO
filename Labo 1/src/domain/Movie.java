package domain;

public class Movie extends Product {

    private final double price = 5;

    public Movie(String title, int id) {
        super(title, id);
    }

    @Override
    public double getPrice(int days) {
        int daysLeft = days - 3;
		return daysLeft > 0 ? price + daysLeft * 2 : price;
    }
}
