package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain2 {
    public void draw(Graphics2D g, int width, int height, int startY) {
        int[] x = {-10, 0, 30, 80, 180, 260, 310, 370, 410, 445, 540, 580, 810, 910, 1050, 1100, 1270, 1380, 1400, 1700, 1710};
        int[] y = {1000, startY, startY - 35, startY + 35, startY + 15, startY + 40, startY + 25, startY + 15,
                startY + 35, startY + 65, startY + 5, startY - 55, startY + 85, startY + 88, startY + 90, startY + 55,
                startY + 30, startY - 30, startY - 55, startY - 35, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int)(height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(182, 29, 52), new Color(200, 45, 66)}));
        g.fillPolygon(x, y, x.length);
    }
}
