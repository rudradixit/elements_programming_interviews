package com.corindiano.elements_programming_interviews.chapter5;

class IncrementIntegerBy1 {
    static int[] increment(int[] digits) {
        boolean first = true;
        boolean carry = false;
        int[] results = new int[digits.length];

        for (int i=digits.length - 1; i>=0; i--) {
            int sum = digits[i] + (first ? 1 : 0) + (carry ? 1 : 0);
            first = false;
            carry = sum >= 10;
            results[i] = sum % 10;
        }

        if (carry) {
            int[] extendedResults = new int[digits.length + 1];
            extendedResults[0] = 1;

            for (int i=0; i<results.length; i++) {
                extendedResults[i+1] = results[i];
            }

            return extendedResults;
        }

        return results;
    }
}