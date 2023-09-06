package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain1 {
    public void draw(Graphics2D g, int width, int height, int startY) {
        int[] x = {-10, 0, 40, 130, 260, 270, 340, 345, 420, 490, 540, 780, 910, 985, 1150, 1200, 1300, 1330, 1400, 1700, 1710};
        int[] y = {1000, startY + 430, startY + 450, startY + 430, startY + 440, startY + 450, startY + 405, startY + 370,
                startY + 390, startY + 425, startY + 390, startY + 500, startY + 485, startY + 520, startY + 440, startY + 430,
                startY + 375, startY + 340, startY + 230, startY + 200, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int) (height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(197, 13, 52), new Color(252, 71, 88)}));
        g.fillPolygon(x, y, x.length);
    }
}