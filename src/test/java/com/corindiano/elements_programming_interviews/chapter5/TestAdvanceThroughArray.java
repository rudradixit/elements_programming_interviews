package com.corindiano.elements_programming_interviews.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAdvanceThroughArray {
    @Test
    void testCase1() {
        assertTrue(AdvanceThroughArray.canReachEnd(new int[] {3, 3, 1, 0, 2, 0, 1, 4, 5, 3, 2, 3, 1, 4, 5, 3, 2, 1, 0, 1, 3, 4, 2, 1, 1}));
    }

    @Test
    void testCase2() {
        assertFalse(AdvanceThroughArray.canReachEnd(new int[] {3, 3, 0, 0, 0, 0, 1}));
    }
}