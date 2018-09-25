package com.corindiano.elements_programming_interviews.chapter5;

class DeleteDuplicateFromSortedArray {
    static void delete(Integer[] array) {
        if (array == null || array.length <= 1) return;

        int len = array.length - 1;
        int p1 = 0, p2 = 1;

        while (p2 <= len) {
            if (array[p1] != array[p2]) {
                p1++;
                p2++;
            } else {
                while (p2 < len && array[p1] == array[p2]) p2++;
                Integer swap = p2 == len ? null : array[p2];
                for (int i=p1+1; i<=p2; i++) array[i] = swap;
            }
        }
    }
}