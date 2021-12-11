package day03;

public class Ceasar extends Encryption {
    private int offset;

    public Ceasar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (Character letter : input.toLowerCase().toCharArray()) {
            if (' ' == letter) {
                sb.append(' ');
            } else {
                if (('z' - letter) < offset) {
                    sb.append((char) ('a' + (offset - ('z' - letter) - 1)));
                } else {
                    sb.append((char) (letter + offset));
                }
            }
        }
        return new String(sb);
    }
}
