package domain;

public class Spiegeling2 extends GeheimSchrift2 {

    private String text;

    public Spiegeling2(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public String decrypt(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public String encrypt(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
