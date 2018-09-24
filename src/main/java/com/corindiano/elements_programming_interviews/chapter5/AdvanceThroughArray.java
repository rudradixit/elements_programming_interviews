package com.corindiano.elements_programming_interviews.chapter5;

import java.util.concurrent.atomic.AtomicInteger;

class AdvanceThroughArray {
    private static boolean _canReachEndWithMem(int[] board, int pos, Boolean[] cache, AtomicInteger counter) {
        if (pos >= board.length - 1) return true;
        if (cache[pos] != null) return cache[pos];
        if (board[pos] == 0) return false;
        counter.incrementAndGet();

        int steps = board[pos];

        boolean results = false;

        for (int s=1; s<=steps; s++) {
            results = results || _canReachEndWithMem(board, pos+s, cache, counter);
        }

        cache[pos] = results;
        return results;
    }

    private static boolean _canReachEnd(int[] board, int pos, AtomicInteger counter) {
        if (pos >= board.length - 1) return true;
        if (board[pos] == 0) return false;
        counter.incrementAndGet();

        int steps = board[pos];

        boolean results = false;

        for (int s=1; s<=steps; s++) {
            results = results || _canReachEnd(board, pos+s, counter);
        }

        return results;
    }

    static boolean canReachEnd(int[] board) {
        AtomicInteger c1 = new AtomicInteger();
        _canReachEnd(board, 0, c1);
        System.out.println("Without caching: " + c1.get());

        Boolean[] cache = new Boolean[board.length];
        cache[board.length - 1] = true;
        AtomicInteger c2 = new AtomicInteger();
        boolean r2 =_canReachEndWithMem(board, 0, cache, c2);
        System.out.println("With caching: " + c2.get());
        return r2;
    }
}