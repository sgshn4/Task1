package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain4 {
    public void draw(Graphics2D g, int width, int height, int startY) {
        int[] x = {-10, 0, 60, 180, 380, 510, 570, 790, 945, 1100, 1150, 1250, 1450, 1500, 1700, 1710};
        int[] y = {1000, startY + 890, startY + 870, startY + 950, startY + 870, startY + 850, startY + 875, startY + 900,
                startY + 910, startY + 830, startY + 825, startY + 875, startY + 860, startY + 855, startY + 863, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int)(height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(80, 5, 25), new Color(110, 2, 36)}));
        g.fillPolygon(x, y, x.length);
    }
}
