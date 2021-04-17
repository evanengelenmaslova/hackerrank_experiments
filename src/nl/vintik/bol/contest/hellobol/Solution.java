package nl.vintik.bol.contest.hellobol;

import java.io.*;

/**
 * This is just a sample program to test input / output in your preferred language. There will be an integer n given to you. To solve this problem, just print "Hello Bol" without quotes, n times.
 * <p>
 * Input Format
 * <p>
 * Constraints
 * <p>
 * Time and memory constraints are mentioned here: https://www.hackerrank.com/environment/languages
 * Output Format
 * <p>
 * n lines each with Hello Bol
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bi.readLine());
        if ((input >= 1 && input <= 100)) {
            for (int i = 0; i < input; i++) {
                System.out.println("Hello Bol");
            }
        }
    }
}
