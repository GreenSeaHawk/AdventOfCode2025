package org.example;

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
        assertEquals(210, Day2.invalidID(95,115));
    }

    @Test
    void TestInvalidID3() {
        assertEquals(2121212121, Day2.invalidID(2121212118,2121212124));
    }

    @Test
    void TestInvalidID4() {
        assertEquals(824824824, Day2.invalidID(824824821,824824827));
    }

    @Test
    void TestRepeatNum1() {
        long num = 22;
        assertEquals(true, Day2.repeatNum(num));
    }

    @Test
    void TestRepeatNum2() {
        long num = 232232232;
        assertEquals(true, Day2.repeatNum(num));
    }

    @Test
    void TestRepeatNum3() {
        long num = 232232233;
        assertEquals(false, Day2.repeatNum(num));
    }

    @Test
    void TestRepeatNum4() {
        long num = 123123123;
        assertEquals(true, Day2.repeatNum(num));
    }

    @Test
    void TestRepeatNum5() {
        long num = 3453423432L;
        assertEquals(false, Day2.repeatNum(num));
    }

    @Test
    void TestRepeatNum6() {
        long num = 1111111;
        assertEquals(true, Day2.repeatNum(num));
    }
}
