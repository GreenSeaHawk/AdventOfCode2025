package org.example.Day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MainDay4 {
    public static void main(String[] args) throws IOException {
        List<List<String>> matrix = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of("src/data/Day4FullData.txt"));
        int numOfLines = lines.size();
        int lenOfLine = 0;
        for (String line : lines) {
            lenOfLine = line.length();
            matrix.add(new ArrayList<>(List.of(line.split(""))));
        }
        System.out.println(matrix);
        System.out.println(matrix.get(0));
        System.out.println(matrix.get(0).get(1));
        System.out.println(matrix.get(1).get(0));
//        first number is y second number is x
        System.out.println(lenOfLine);
        System.out.println(numOfLines);
        int totalRemoved = 0;
        int removed = 0;
        ArrayList<Object> result = Day4.accessRolls(matrix);
        removed = (int) result.get(0);
        totalRemoved += removed;
        List<List<String>> newMatrix = (List<List<String>>) result.get(1);
        while (removed != 0){
            ArrayList<Object> newResult = Day4.accessRolls(newMatrix);
            removed = (int) newResult.get(0);
            newMatrix = (List<List<String>>) newResult.get(1);
            totalRemoved += removed;
        }
        System.out.println("Day 4, part 1: " + totalRemoved);
    }
}