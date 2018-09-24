package com.corindiano.elements_programming_interviews.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMoveEvenToBeginning {
    @Test
    void testCase1() {
        int[] results = null;
        MoveEvenToBeginning.move(results);
        assertNull(results);
    }

    @Test
    void testCase2() {
        int[] results = {1};
        MoveEvenToBeginning.move(results);
        assertNotNull(results);
        assertArrayEquals(new int[]{1}, results);
    }

    @Test
    void testCase3() {
        int[] results = {1, 2, 3, 4, 5};
        MoveEvenToBeginning.move(results);
        assertNotNull(results);
        assertEquals(5, results.length);

        boolean foundOdd = false;

        for (int i=0; i<results.length; i++) {
            if (foundOdd && results[i] % 2 == 0) fail();

            if (results[i] % 2 == 1) {
                foundOdd = true;
            }
        }
    }

    @Test
    void testCase4() {
        int[] results = {99, 76, 45, 33, 44, 81, 52, 94, 48};
        MoveEvenToBeginning.move(results);
        assertNotNull(results);
        assertEquals(9, results.length);

        boolean foundOdd = false;

        for (int i=0; i<results.length; i++) {
            if (foundOdd && results[i] % 2 == 0) fail();

            if (results[i] % 2 == 1) {
                foundOdd = true;
            }
        }
    }
}