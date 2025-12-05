package org.example;

import org.example.Day3.Day3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {


    @Test
    void TestBiggestInt1() {
        assertEquals(987654321111L, Day3.biggestInt("987654321111111"));
    }

    @Test
    void TestBiggestInt2() {
        assertEquals(811111111119L, Day3.biggestInt("811111111111119"));
    }

    @Test
    void TestBiggestInt3() {
        assertEquals(434234234278L, Day3.biggestInt("234234234234278"));
    }
}
