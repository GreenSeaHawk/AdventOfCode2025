package org.example.Day4;

import java.util.ArrayList;
import java.util.List;

public class Day4 {
    public static ArrayList<Object> accessRolls(List<List<String>> matrix) {
        final int lenOfLine = matrix.get(0).size();
        final int numOfLines = matrix.size();
//        Pad out the matrix
        List<String> newTopRow = new ArrayList<>();
        for (int i = 0; i < lenOfLine; i++) {
            newTopRow.add(".");
        }
        matrix.add(0, newTopRow);

        List<String> newRow = new ArrayList<>();
        for (int i = 0; i < lenOfLine; i++) {
            newRow.add(".");
        }
        matrix.add(newRow);

        for (List<String> row : matrix) {
            row.add(0, ".");
            row.add(".");
        }
//        Reset size of matrix
        int newLenOfLine = matrix.get(0).size();
        int newNumOfLines = matrix.size();
        int total = 0;
        int sum = -1;
        List<List<Integer>> removeCoords = new ArrayList<>();
        for (int i = 1; i < newLenOfLine - 1; i++) {
            for (int j = 1; j < newNumOfLines - 1; j++) {
                if (matrix.get(j).get(i).equals("@")) {
                    for (int k = -1; k < 2; k++) {
                        for (int l = -1; l < 2; l++) {
                            if (matrix.get(j + k).get(i + l).equals("@")) {
                                sum += 1;
                            }
                        }
                    }
                    if (sum < 4) {
                        total += 1;
                        removeCoords.add(List.of(i,j));
                    }
                    sum = -1;
                }
            }
        }
        for (List<Integer> coords : removeCoords){
            matrix.get(coords.get(1)).set(coords.get(0),".");
        }
//      Unpad matrix, remove top and bottom rows
        matrix.remove(0);

        matrix.remove(matrix.size() - 1);

//      remove left + right columns from every remaining row
        for (List<String> row : matrix) {
            row.remove(0);
            row.remove(row.size() - 1);
        }
        ArrayList<Object> result = new ArrayList<>();
        result.add(total);
        result.add(matrix);
        return result;
    }
}


