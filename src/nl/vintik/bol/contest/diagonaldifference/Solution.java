package nl.vintik.bol.contest.diagonaldifference;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class DiagonalDifference {
    private long primaryDiagonal = 0;
    private long secondaryDiagonal = 0;
    private int primaryDiagonalIndex = 0;
    private int secondaryDiagonalIndex;

    public DiagonalDifference(int secondaryDiagonalIndex) {
        this.secondaryDiagonalIndex = secondaryDiagonalIndex;
    }


    public void addDiagonals(List<Integer> row) {
        addPrimaryDiagonal(row);
        addSecondaryDiagonal(row);
    }

    public int getDiagonalDifference() {
        return (int) Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    private void addPrimaryDiagonal(List<Integer> row) {
        primaryDiagonal += row.get(getPrimaryDiagonalIndex());
        incPrimaryIndex();
    }

    private void addSecondaryDiagonal(List<Integer> row) {
        secondaryDiagonal += row.get(getSecondaryDiagonalIndex());
        decSecondaryIndex();
    }

    private void incPrimaryIndex() {
        primaryDiagonalIndex++;
    }

    private void decSecondaryIndex() {
        secondaryDiagonalIndex--;
    }

    private int getPrimaryDiagonalIndex() {
        return primaryDiagonalIndex;
    }

    private int getSecondaryDiagonalIndex() {
        return secondaryDiagonalIndex;
    }
}

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        final DiagonalDifference result = new DiagonalDifference(arr.size() -1);
        arr.forEach(result::addDiagonals);
        return result.getDiagonalDifference();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
