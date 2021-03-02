package domain;

public class CaesarText extends GeheimSchrift {
    private int verplaatsing=5;

    public void setVerplaatsing(int verplaatsing) {
        this.verplaatsing = verplaatsing;
    }

    @Override
    public String decrypt(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c: input.toLowerCase().toCharArray()) { // ["k", "o", "e", "n", "1"]
            if (c <= 'z' && c >= 'a') {
                sb.append((char) ((c - verplaatsing - 'z') % 26 + 'z'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override
    public String encrypt(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c: input.toLowerCase().toCharArray()) { // ["k", "o", "e", "n"]
            if (c <= 'z' && c >= 'a' ) {
                sb.append((char) ((c + verplaatsing - 'a') % 26 + 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
