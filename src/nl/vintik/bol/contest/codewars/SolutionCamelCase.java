package nl.vintik.bol.contest.codewars;

public class SolutionCamelCase {
    static String toCamelCase(String inputString) {
        if (inputString != null && inputString.trim().length() > 0) {
            StringBuilder result = new StringBuilder(inputString.length());
            final String[] splitInputString = inputString.split("[_-]");

            for (int i = 0; i < splitInputString.length; i++) {
                final String word = splitInputString[i];
                if (!word.isEmpty()) {
                    if (i == 0) { //first word, keep case
                        result.append(word.charAt(0));
                    } else {
                        result.append(word.substring(0, 1).toUpperCase());
                    }
                    result.append(word.substring(1).toLowerCase());
                }

            }
            return result.toString();
        }
        return "";
    }
}
