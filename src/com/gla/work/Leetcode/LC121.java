package com.gla.work.Leetcode;

public class LC121 {
        public int maxProfit(int[] prices) {
            int min = prices[0];
            int profit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                } else {
                    profit = Math.max(profit, prices[i] - min);
                }
            }

            return profit;
        }
    public static void main(String[] args){

    }
}
