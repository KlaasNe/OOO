package domain;

public class Spiegeling extends GeheimSchrift{

    private String text;

    public Spiegeling(String text) {
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
