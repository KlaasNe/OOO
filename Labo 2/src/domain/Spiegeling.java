package domain;

public class Spiegeling {

    private final String text;

    public Spiegeling(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public String spiegel() {
        return StringFormatter.reverseString(this.getText());
    }
}

class StringFormatter {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
