package nl.vintik.bol.contest.staircase;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String step = String.join("", Collections.nCopies(i, "#"));
            System.out.printf("%" + n + "s%n", step);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
