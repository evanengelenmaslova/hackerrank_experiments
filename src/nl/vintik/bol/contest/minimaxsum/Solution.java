package nl.vintik.bol.contest.minimaxsum;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        if(!arr.isEmpty()){
            List<Integer> sorted = arr.stream().sorted().collect(toList());
            System.out.print(sorted.subList(0, 4).stream().mapToLong(Long::valueOf).sum());
            System.out.print(" ");
            System.out.print(sorted.subList(1, 5).stream().mapToLong(Long::valueOf).sum());
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
