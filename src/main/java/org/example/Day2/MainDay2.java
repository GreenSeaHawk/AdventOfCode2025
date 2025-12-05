package org.example.Day2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainDay2 {
    public static void main(String[] args) throws IOException {
        long total = 0;
        String line = Files.readString(Path.of("src/data/Day2FullData.txt")).trim();
        String[] parts = line.split(",");
        for (String part : parts) {
            long num1 = Long.parseLong(part.split("-")[0]);
            long num2 = Long.parseLong(part.split("-")[1]);
            total += Day2.invalidID(num1, num2);
        }
        System.out.println("Day 2, part 2 answer: " + total);
    }
}