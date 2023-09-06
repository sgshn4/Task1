package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Cactus {
    public void draw(Graphics2D g, int startX, int startY, int width, int height) {
        g.drawRect(startX, startY, width, height);
        g.drawOval(startX, startY - width / 2, width, width);

        int[] x = new int[10];
        int[] y = new int[10];
        int fixX = 0;
        int fixY = 0;

        for (int i = 0; i < 10; i++) {
            x[i] = 100 + i * 5;
            if (((int)(Math.pow(i, 3))) / 3 < height / 3) {
                y[i] = 500 - ((int) (Math.pow(i, 3))) / 3;
                fixX = x[i];
                fixY = y[i];
            } else {
                x[i] = fixX;
                y[i] = fixY;
            }
        }
        g.drawPolyline(x, y, 10);

        for (int i = 0; i < 10; i++) {
            x[i] = 100 + i * 5;
            if (((int)(Math.pow(i, 4))) / 4 < height / 3) {
                y[i] = 480 - ((int) (Math.pow(i, 4))) / 4;
                fixX = x[i];
                fixY = y[i];
            } else {
                x[i] = fixX;
                y[i] = fixY;
            }
        }

        g.drawPolyline(x, y, 10);
    }
}
