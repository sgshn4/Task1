package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public abstract class MountainFactory {
    public static Mountain createFirst() {
        int[] x = {-1, 0, 3, 8, 16, 17, 21, 22, 26, 30, 33, 48, 56, 61, 71, 75, 81, 83, 87, 106, 110};
        int[] y = {1000, 0, 20, 0, 10, 20, -25, -60, -10, -5, -40, 70, 55, 90, 10, 0, -55, -90,
                -200, -230, 1000};
        Color[] colors = {new Color(197, 13, 52), new Color(252, 71, 88)};
        return new Mountain(48, x, y, colors);
    }

    public static Mountain createSecondary() {
        int[] x = {-10, 0, 2, 5, 11, 16, 19, 23, 25, 27, 33, 36, 50, 56, 65, 68, 79, 86, 87, 106, 110};
        int[] y = {1000, 0, -35, 35, 15, 40, 25, 15, 35, 65, 5, -55, 85, 88, 90, 55, 30, -30, -55, -35, 1000};
        Color[] colors = {new Color(182, 29, 52), new Color(200, 45, 66)};
        return new Mountain(58, x, y, colors);
    }

    public static Mountain createThird() {
        int[] x = {-10, 0, 5, 10, 11, 21, 25, 33, 36, 45, 53, 59, 61, 63, 66, 75, 78, 84, 89, 93, 106, 110};
        int[] y = {1000, 0, -15, -5, -15, 15, 25, -15, 30, 70, -40, -65, -15, -5, 30, -35, -25, 15, 65, 10, -35, 1000};
        Color[] colors = {new Color(125, 8, 33), new Color(162, 20, 33)};
        return new Mountain(75, x, y, colors);
    }

    public static Mountain createFourth() {
        int[] x = {-10, 0, 3, 11, 23, 31, 35, 49, 59, 68, 71, 75, 90, 93, 106, 110};
        int[] y = {1000, 0, -20, 60, -20, -10, -15, 10, 20, -60, -65, -15, -30, -35, -27, 1000};
        Color[] colors = {new Color(80, 5, 25), new Color(110, 2, 36)};
        return new Mountain(87, x, y, colors);
    }
}
