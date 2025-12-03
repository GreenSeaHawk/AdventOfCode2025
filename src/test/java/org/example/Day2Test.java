package org.example;

import org.example.Day1.Day1;
import org.example.Day2.Day2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {

    int testDial = 50;

    @Test
    void TestInvalidID1() {
        assertEquals(33, Day2.invalidID(11,22));
    }

    @Test
    void TestInvalidID2() {
        assertEquals(99, Day2.invalidID(95,115));
    }

    @Test
    void TestInvalidID3() {
        assertEquals(0, Day2.invalidID(2121212118,2121212124));
    }


}
