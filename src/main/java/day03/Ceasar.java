package day03;

public class Ceasar extends Encryption {
    private int offset;

    public Ceasar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (Character c : input.toCharArray()) {
            if (' ' == c) {
                sb.append(' ');
            } else {
                if (('z' - c) < offset) {
                    sb.append((char) ('a' + (offset - ('z' - c) - 1)));
                } else {
                    sb.append((char) (c + offset));
                }
            }
        }
        return new String(sb);
    }


}
