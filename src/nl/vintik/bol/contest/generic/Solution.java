package nl.vintik.bol.contest.generic;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int input1 = 0;
        int input2 = 0;
        String[] lineParams = getSplitLine(bi);
        if (validLine(lineParams)) {
            //validate values
            input1 = Integer.parseInt(lineParams[0]);
            input2 = Integer.parseInt(lineParams[1]);
            doIt(input1, input2);
        }
        bi.close();
    }

    private static String[] getSplitLine(BufferedReader bi) throws IOException {
        return bi.readLine().split("\\s");
    }


    private static boolean validLine(String[] lineParams) {
        return lineParams.length > 1;
    }

    public static void doIt(int input1, int input2) {

        if (validValues(input1, input2)) {
            //process
            process(input1, input2);
        }

    }

    private static boolean validValues(int input1, int input2) {
        return ((input1 >= 1 && input1 <= 100) && (input2 >= 1 && input2 <= 100));
    }

    private static void process(int input1, int input2) {
        System.out.println(input1 < input2 ? input1 : input2);
        System.exit(0);
    }

}
