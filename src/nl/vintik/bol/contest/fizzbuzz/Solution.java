package nl.vintik.bol.contest.fizzbuzz;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] lineParams = getSplitLine(bi);
        if (validLine(lineParams)) {
            //validate values
            doIt(Integer.parseInt(lineParams[0]));
        }
        bi.close();
    }

    private static String[] getSplitLine(BufferedReader bi) throws IOException {
        return bi.readLine().split("\\s");
    }


    private static boolean validLine(String[] lineParams) {
        return lineParams.length > 0;
    }

    public static void doIt(int n) {

        if (validValues(n)) {
            //process
            process(n);
        }

    }

    private static boolean validValues(int n) {
        return n > 0 && n < (2 * Math.pow(10, 5));
    }

    private static void process(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.exit(0);
    }

}
