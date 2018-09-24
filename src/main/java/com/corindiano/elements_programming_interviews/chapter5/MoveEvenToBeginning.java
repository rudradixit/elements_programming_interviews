package com.corindiano.elements_programming_interviews.chapter5;

class MoveEvenToBeginning {
    private static boolean isEven(int n) { return n % 2 == 0; }
    private static boolean isOdd(int n) { return n % 2 == 1; }

    static void move(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }

        int len = array.length;
        int start = 0;
        int end = len - 1;

        while (start < end) {
            if (isEven(array[start])) {
                start++;
            } else if (isOdd(array[start]) && isOdd(array[end])) {
                end--;
            } else if (isOdd(array[start]) && isEven(array[end])) {
                int t = array[start];
                array[start] = array[end];
                array[end] = t;
                start++;
                end--;
            }
        }
    }
}