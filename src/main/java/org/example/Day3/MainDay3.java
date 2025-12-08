package org.example.Day3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainDay3 {
    public static void main(String[] args) throws IOException {
        Long sum = 0L;
        List<String> lines = Files.readAllLines(Path.of("src/data/Day3FullData.txt"));
        for (String line : lines) {
            sum += Day3.biggestInt(line);
        }
        System.out.println("Day 3, part 1 answer: " + sum);
    }
}