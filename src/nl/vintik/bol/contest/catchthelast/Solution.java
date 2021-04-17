package nl.vintik.bol.contest.catchthelast;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String input1 = "";
        while (true) {
            input1 = inputScanner.next();

            if ((input1.length() < 0 || input1.length() > 100) ) {
               // System.out.println("Oops! 2 Numbers between 1 and 100 please");
                inputScanner.nextLine();
            } else {
                break;
            }
        }
        inputScanner.close();

        System.out.println(input1.substring(input1.length() - 1));
    }
}
