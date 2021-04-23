package nl.vintik.bol.contest.codewars;

import java.util.*;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        if(stops != null && stops.size() != 0){
            result = stops.stream()
                    .mapToInt(tuple -> tuple[0] - tuple[1])
                    .sum();
        }
        return result;
    }
}
