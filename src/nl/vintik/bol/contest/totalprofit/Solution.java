package nl.vintik.bol.contest.totalprofit;

import java.io.*;
import java.util.*;

/**
 * We want to know the amount of profit we earned in a certain amount of days.
 * Given the individual profit of  day, for all  days, find the total profit.
 * <p>
 * Input Format
 * <p>
 * First line contains an integer T, the number of test cases.
 * <p>
 * Following T pairs of line each have an integer on the first line,n, the number of days.
 * The next line contains n space seperated integers, p0,p1,p3... , the profit of the n individual days.
 * <p>
 * Constraints
 * <p>
 * First (easy) test cases:
 * <p>
 * Second (hard) test cases:
 * <p>
 * Output Format
 * <p>
 * lines each containing an integer, the total profit of that test case.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] lineParams = getSplitLine(bi);
        if (validFirstLine(lineParams)) {
            //validate values
            int testCases = Integer.parseInt(lineParams[0]);
            if (validTestCasesValue(testCases)) {
                //process
                process(testCases, bi);
            }

        }
    }

    private static String[] getSplitLine(BufferedReader bi) throws IOException {
        return bi.readLine().split("\\s");
    }

    private static void process(int testCases, BufferedReader bi) throws IOException {
        List<Long> results = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            String[] lineParamsNoDays = getSplitLine(bi);
            if(validNoDaysLine(lineParamsNoDays)) {
                int noDays = Integer.parseInt(lineParamsNoDays[0]);
                long sum = 0;
                String[] lineParamsProfit = getSplitLine(bi);
                if(validProfit(lineParamsProfit, noDays)) {
                    for (String numStr: lineParamsProfit)
                        sum += Integer.parseInt(numStr);

                    results.add(sum);
                }
            }
        }
        results.forEach(System.out::println);
        System.exit(0);
    }

    private static boolean validFirstLine(String[] lineParams) {
        return lineParams.length > 0;
    }
    private static boolean validNoDaysLine(String[] lineParams) {
        return lineParams.length > 0;
    }
    private static boolean validProfit(String[] lineParams, int noDays) {
        return lineParams.length >= noDays;
    }
    private static boolean validTestCasesValue(int itestCases) {
        return itestCases >= 1 && itestCases <= 10;
    }
}
