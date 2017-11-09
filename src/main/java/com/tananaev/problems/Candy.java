package com.tananaev.problems;

public class Candy {

    public void ripple(int[] ratings, int[] candies, int from) {
        for (int i = from - 1; i >= 0; i--) {
            if (candies[i] != candies[i + 1] || ratings[i] == ratings[i + 1]) {
                break;
            }
            candies[i] += 1;
        }
    }

    public int candy(int[] ratings) {
        int result = 0;
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
                if (candies[i - 1] == 1 && ratings[i - 1] > ratings[i]) {
                    ripple(ratings, candies, i);
                }
            }
        }
        for (int i : candies) {
            result += i;
        }
        return result;
    }

}
