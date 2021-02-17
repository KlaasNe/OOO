package ui;

import domain.Shop2;

import javax.swing.*;
import java.security.KeyException;

public class ShopAppeke {
    public static void main(String[] args) {
        Shop2 shop = new Shop2();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            try {
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException e) {
                choice = 0;
            }
            try {
                if (choice == 1) {
                    shop.addProduct();
                } else if (choice == 2) {
                    shop.showProduct();
                } else if (choice == 3) {
                    shop.showPrice();
                }
            } catch (KeyException e) {
                System.out.println(e); //TODO
            }
        }
    }
}
