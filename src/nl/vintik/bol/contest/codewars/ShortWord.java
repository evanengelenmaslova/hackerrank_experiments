package nl.vintik.bol.contest.codewars;

import java.util.*;

public class ShortWord {
    public static int findShort(String inputString) {
        if (inputString != null && inputString.trim().length() > 0) {
            final String[] splitInputString = inputString.split("[\\s]");
            return Arrays.stream(splitInputString)
                    .min(Comparator.comparingInt(String::length))
                    .map(String::length)
                    .orElse(0);
        }
        return 0;
    }
}
