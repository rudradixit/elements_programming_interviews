package com.corindiano.elements_programming_interviews.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFindMaximumProfit {
    @Test
    void testCase1() {
        assertEquals(30, FindMaximumProfit.find(new int[] {310, 315, 275, 295, 260, 270, 290, 230, 255, 250}));
    }

    @Test
    void testCase2() {
        assertEquals(4, FindMaximumProfit.find(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void testCase3() {
        assertEquals(0, FindMaximumProfit.find(new int[] {5, 4, 3, 2}));
    }
}