package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day1Test {

    int testDial = 50;

    @Test
    void TestNewPosition1() {
        String rot = "R51";
        assertEquals(1, Day1.newPosition(testDial, rot));
    }

    @Test
    void TestNewPosition2() {
        String rot = "L51";
        assertEquals(99, Day1.newPosition(testDial, rot));
    }

    @Test
    void TestNewPosition3() {
        String rot = "R350";
        assertEquals(0, Day1.newPosition(testDial, rot));
    }

    @Test
    void TestNewPositionCountZero1() {
        String rot = "R51";
        assertEquals(1, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero2() {
        String rot = "L51";
        assertEquals(1, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero3() {
        String rot = "L49";
        assertEquals(0, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero4() {
        String rot = "R49";
        assertEquals(0, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero5() {
        String rot = "R351";
        assertEquals(4, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero6() {
        String rot = "R50";
        assertEquals(0, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero7() {
        String rot = "L50";
        assertEquals(0, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero8() {
        String rot = "L120";
        assertEquals(1, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero9() {
        String rot = "R120";
        assertEquals(1, Day1.newPositionCountZero(testDial, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero10() {
        String rot = "L5";
        assertEquals(0, Day1.newPositionCountZero(0, rot)[1]);
    }

    @Test
    void TestNewPositionCountZero11() {
        String rot = "R5";
        assertEquals(0, Day1.newPositionCountZero(95, rot)[1]);
    }
}
