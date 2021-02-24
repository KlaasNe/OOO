package domain;

public class Spiegeling {

    private final String text;

    public Spiegeling(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public String spiegel(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
