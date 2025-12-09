package org.example;

import org.example.Day4.Day4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day4Test {

    @Test
    void TestAccessRolls(){
        List<List<String>> testMatrix = new ArrayList<>();
        testMatrix.add(new ArrayList<>(List.of("@", "@", "@")));
        testMatrix.add(new ArrayList<>(List.of("@", "@", "@")));
        testMatrix.add(new ArrayList<>(List.of("@", "@", "@")));
        ArrayList<Object> result = Day4.accessRolls(testMatrix);
        assertEquals(4, result.get(0));
        List<List<String>> expectedReturnMatrix = new ArrayList<>();
        expectedReturnMatrix.add(new ArrayList<>(List.of(".", "@", ".")));
        expectedReturnMatrix.add(new ArrayList<>(List.of("@", "@", "@")));
        expectedReturnMatrix.add(new ArrayList<>(List.of(".", "@", ".")));
        assertEquals(expectedReturnMatrix, result.get(1));
    }

}
