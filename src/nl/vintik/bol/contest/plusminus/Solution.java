package nl.vintik.bol.contest.plusminus;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        if (!arr.isEmpty()) {
            DecimalFormat df = new DecimalFormat("#.######");
            df.setRoundingMode(RoundingMode.CEILING);

            double totalInts = arr.size();
            double positiveRatio = arr.stream().filter(number -> number > 0).count() / totalInts;
            double negativeRatio = arr.stream().filter(number -> number < 0).count() / totalInts;
            double zeroRatio = arr.stream().filter(number -> number == 0).count() / totalInts;

            System.out.println(df.format(positiveRatio));
            System.out.println(df.format(negativeRatio));
            System.out.println(df.format(zeroRatio));
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
