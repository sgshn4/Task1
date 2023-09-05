package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

public abstract class Utils {
    public static int findMin(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) result = array[i];
        }
        return result;
    }
}
