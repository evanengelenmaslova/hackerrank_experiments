package nl.vintik.bol.contest.smallernumber;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String line = bi.readLine();
        int input1 = 0;
        int input2 = 0;
        String[] numStr = line.split("\\s");
        input1 = Integer.parseInt(numStr[0]);
        input2 = Integer.parseInt(numStr[1]);
        if ((input1 >= 1 && input1 <= 100) && (input2 >= 1 && input2 <= 100)) {
            System.out.println(input1 < input2 ? input1 : input2);
        }
    }
}
