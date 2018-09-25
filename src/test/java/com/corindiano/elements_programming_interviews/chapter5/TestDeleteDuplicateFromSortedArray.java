package com.corindiano.elements_programming_interviews.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDeleteDuplicateFromSortedArray {
    @Test
    void testCase1() {
        Integer[] input = new Integer[] {2, 3, 3, 3, 5, 5, 5, 7, 7};
        DeleteDuplicateFromSortedArray.delete(input);
        assertEquals(9, input.length);
        assertEquals("2", input[0].toString());
        assertEquals("3", input[1].toString());
        assertEquals("5", input[2].toString());
        assertEquals("7", input[3].toString());
        for (int i=4; i<input.length; i++) {
            if (input[i] != null) fail();
        }
    }
}