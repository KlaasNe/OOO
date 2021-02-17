package src.domain;

import javax.swing.*;
import java.security.KeyException;
import java.util.HashMap;

public class Shop2 {
    private final HashMap<Integer, Product> products;

    public Shop2() {
        products = new HashMap<>();
    }

    public void addProduct() {
        String title = JOptionPane.showInputDialog("Enter the title:");
        int id = inputInt();
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");

        if (type.equalsIgnoreCase("M")) {
            Product product = new Movie(title, id);
            this.products.put(id, product);
        }

        else if (type.equalsIgnoreCase("G")) {
            Product product = new Game(title, id);
            this.products.put(id, product);
        }
    }

    public void showProduct() throws KeyException {
        int id = inputInt();

        Product product = this.products.get(id);
        JOptionPane.showMessageDialog(null, product.getTitle());
    }

    public void showPrice() throws KeyException {
        int id = inputInt();
        Product product = this.products.get(id);
        int days = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days:"));
        JOptionPane.showMessageDialog(null, product.getPrice(days));
    }

    private int inputInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
    }
}
