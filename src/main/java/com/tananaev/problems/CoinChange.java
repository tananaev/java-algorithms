package com.tananaev.problems;

import java.util.SortedSet;
import java.util.TreeSet;

public class CoinChange {

    public int coinChange(SortedSet<Integer> coins, int amount) {
        if (amount == 0) return 0;
        if (coins.isEmpty()) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int coin = coins.last();
        if (amount % coin == 0) return amount / coin;
        for (int i = 0; i <= amount / coin; i++) {
            int result = coinChange(coins.headSet(coin), amount - i * coin);
            if (result != Integer.MAX_VALUE) {
                min = Math.min(min, result + i);
            }
        }
        return min;
    }

    public int coinChange(int[] coins, int amount) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int coin : coins) {
            set.add(coin);
        }
        int result = coinChange(set, amount);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

}
