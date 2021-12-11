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
            sb.append((char) (c + offset));
        }
        return new String(sb);
    }
}
