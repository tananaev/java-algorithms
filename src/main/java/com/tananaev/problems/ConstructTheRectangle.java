package com.tananaev.problems;

public class ConstructTheRectangle {

    public int[] constructRectangle(int area) {
        int ideal = (int) Math.ceil(Math.sqrt(area));
        while (area % ideal > 0) {
            ideal += 1;
        }
        return new int[]{ideal, area / ideal};
    }

}
