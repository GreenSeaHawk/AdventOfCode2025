package org.example.Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainDay1 {
    public static void main(String[] args) throws IOException {
        int dial = 50;
        int count = 0;
        List<String> lines = Files.readAllLines(Path.of("src/data/Day1FullData.txt"));
        for (String line : lines) {
            dial = Day1.newPosition(dial, line);
            if (dial == 0) {
                count += 1;
            }
        }

        System.out.println("Day 1, part 1 answer: " + count);

        dial = 50;
        count = 0;
        List<String> lines2 = Files.readAllLines(Path.of("src/data/Day1FullData.txt"));
        for (String line : lines2) {
            int [] result = Day1.newPositionCountZero(dial, line);
            dial = result[0];
            count += result[1];
            if (dial == 0) {
                count += 1;
            }
        }
        System.out.println("Day 1, part 2 answer: " + count);
    }
}