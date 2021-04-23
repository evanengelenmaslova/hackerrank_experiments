package nl.vintik.bol.contest.codewars;

public class PangramChecker {
    private static final int ALPHABET_COUNT = 26;

    public boolean check(String sentence) {
        if (sentence == null || sentence.trim().length() == 0) {
            return false;
        }
        return sentence
                .chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == ALPHABET_COUNT;
    }
}
