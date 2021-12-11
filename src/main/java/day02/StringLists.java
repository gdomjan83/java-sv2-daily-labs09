package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words) {
        List<String> shortest = new ArrayList<>();
        int length = getShortestLength(words);
        for (String word : words) {
            if (word.length() == length) {
                shortest.add(word);
            }
        }
        return shortest;
    }

    private int getShortestLength(List<String> words) {
        int length = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < length) {
                length = word.length();
            }
        }
        return length;
    }
}
