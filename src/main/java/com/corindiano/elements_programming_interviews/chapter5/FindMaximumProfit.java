package com.corindiano.elements_programming_interviews.chapter5;

class FindMaximumProfit {
    static int find(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int profit = 0;
        int minimum = prices[0];

        for (int i=1; i<prices.length; i++) {
            profit = Math.max(profit, prices[i] - minimum);
            minimum = Math.min(minimum, prices[i]);
        }

        return profit;
    }
}