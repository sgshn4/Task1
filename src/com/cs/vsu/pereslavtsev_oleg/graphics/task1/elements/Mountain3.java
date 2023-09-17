package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain3 {
    public void draw(Graphics2D g, int width, int height, int startY) {
        int[] x = {-10, 0, 80, 160, 175, 350, 400, 530, 590, 735, 850, 950, 990, 1020, 1060, 1200, 1250, 1350, 1430, 1500, 1700, 1710};
        int[] y = {1000, startY, startY - 15, startY - 5, startY - 15, startY + 15, startY + 25, startY - 15,
                startY + 30, startY + 70, startY - 40, startY - 65, startY - 15, startY - 5, startY + 30, startY -35,
                startY - 25, startY + 15, startY + 65, startY + 10, startY -35, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int)(height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(125, 8, 33), new Color(162, 20, 33)}));
        g.fillPolygon(x, y, x.length);
    }
}
