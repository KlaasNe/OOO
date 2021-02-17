package domain;

public class Movie extends Product{
    private double price = 5;
    public Movie(String title, int id, double price) {
        super(title, id, price);
    }

    @Override
    public double getPrice(int productId, int days) {
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
		return price;
    }

}
