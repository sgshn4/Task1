package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain3 {
    public void draw(Graphics2D g, int width, int height, int startY) {
        int[] x = {-10, 0, 80, 160, 175, 350, 400, 530, 590, 735, 850, 950, 990, 1020, 1060, 1200, 1250, 1350, 1430, 1500, 1700, 1710};
        int[] y = {1000, startY + 775, startY + 760, startY + 770, startY + 760, startY + 790, startY + 800, startY + 760,
                startY + 805, startY + 845, startY + 735, startY + 710, startY + 760, startY + 770, startY + 805, startY + 745,
                startY + 750, startY + 790, startY + 840, startY + 785, startY + 740, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int)(height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(125, 8, 33), new Color(162, 20, 33)}));
        g.fillPolygon(x, y, x.length);
    }
}
