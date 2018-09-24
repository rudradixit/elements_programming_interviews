package com.corindiano.elements_programming_interviews.chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestIncrementIntegerBy1 {
    @Test
    void testCase1() {
        assertArrayEquals(new int[] {1, 0, 0, 0}, IncrementIntegerBy1.increment(new int[] {9, 9, 9}));
    }

    @Test
    void testCase2() {
        assertArrayEquals(new int[] {4, 6, 5, 3, 3}, IncrementIntegerBy1.increment(new int[] {4, 6, 5, 3, 2}));
    }
}