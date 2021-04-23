package nl.vintik.bol.contest.codewars;

import java.util.*;
import java.util.stream.*;

import static java.util.function.Predicate.not;

public class Dubstep {
    public static String SongDecoder(String song) {
        final String[] splitInputString = song.split("WUB");
        return Arrays.stream(splitInputString).filter(not(String::isBlank)).collect(Collectors.joining(" "));
    }
}
