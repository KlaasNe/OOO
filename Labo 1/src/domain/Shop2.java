package domain;

import javax.swing.*;
import java.security.KeyException;
import java.util.HashMap;

public class Shop2 {
    private HashMap<Integer, Product> products;

    public Shop2() {
        products = new HashMap<>();
    }

    public void addProduct() {
        String title = JOptionPane.showInputDialog("Enter the title:");
        int id = getIdInt();
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price:"));

        if (type.equalsIgnoreCase("M")) {
            Product product = new Movie(title, id, price);
            this.products.put(id, product);
        }

        else if (type.equalsIgnoreCase("G")) {
            Product product = new Game(title, id, price);
            this.products.put(id, product);
        }
    }

    public void showProduct() throws KeyException {
        int id = getIdInt();

        Product product = this.products.get(id);
        JOptionPane.showMessageDialog(null, product.getTitle());
    }

    public void showPrice() throws KeyException {
        int id = getIdInt();
        Product product = this.products.get(id);
//        JOptionPane.showMessageDialog(null, product.getPrice()); NOG AFWERKEN
    }

    private int getIdInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
    }
}
