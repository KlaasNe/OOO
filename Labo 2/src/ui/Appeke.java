package ui;

import domain.CaesarText;
import domain.GeheimSchrift;
import domain.Spiegeling;

public class Appeke {
    public static void main(String[] args) {
        CaesarText encrypteer = new CaesarText();
        CaesarText encrypteer2 = new CaesarText();
        String frits = "Frits is mal 123";
        String frits2 = "iulwv lv pdo 123";
        encrypteer.setVerplaatsing(3);

        System.out.println(encrypteer.encrypt(frits));
        System.out.println(encrypteer.decrypt(frits2));

        Spiegeling spiegeling = new Spiegeling("Malle Jurgen");
        System.out.println(spiegeling.encrypt("Malle Jurgen2"));

    }
}
