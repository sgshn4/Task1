package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.primitives;

import java.awt.*;

public class Primitives {
    public void drawSin(Graphics2D g, int startX, int startY, int arg1, double arg2) {
        int[] x = new int[1000];
        int[] y = new int[1000];
        for (int i = 0; i < 1000; i++) {
            x[i] = startX + i;
            y[i] = startY + (int)(arg1 * Math.sin(i * arg2));
        }

        g.drawPolyline(x, y, 1000);
    }
}
