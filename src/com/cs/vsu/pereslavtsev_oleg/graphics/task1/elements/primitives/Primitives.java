package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.primitives;

import java.awt.*;

public class Primitives {
    public void drawSin(Graphics2D g, int startX, int startY, int arg1, double arg2) {
        int[] x = new int[1702];
        int[] y = new int[1702];
        x[0] = startX + -10;
        x[1701] = startX + 1710;
        y[0] = startY + 1000;
        y[1701] = startY + 1000;
        for (int i = 1; i < 1701; i++) {
            x[i] = startX + i;
            y[i] = startY + (int)(arg1 * Math.sin(i * arg2));
        }

        g.drawPolygon(x, y, 1702);
    }

    public void drawOval(Graphics2D g, int startX, int startY, int r) {
        g.setPaint(new Color(0, 0, 0));
        g.fillArc(startX, startY, r, r, 0, 180);
    }
}
