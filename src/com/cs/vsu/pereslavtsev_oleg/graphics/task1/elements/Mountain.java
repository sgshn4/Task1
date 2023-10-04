package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain {

    private int startY;

    private int[] shiftX;
    private int[] shiftY;
    private Color[] colors;

    public Mountain(int startY, int[] shiftX, int[] shiftY, Color[] colors) {
        this.startY = startY;
        this.shiftX = shiftX;
        this.shiftY = shiftY;
        this.colors = colors;
    }

    public void draw(Graphics2D g, int width, int height, int multiplierY, int partWidth) {
        int[] pointsX = new int[shiftX.length];
        int[] pointsY = new int[shiftY.length];
        for (int i = 0; i < pointsX.length; i++) {
            pointsX[i] = partWidth * shiftX[i];
            if (i == 0 || i == shiftX.length - 1) {
                pointsY[i] = 1000;
            } else {
                pointsY[i] = startY * multiplierY + shiftY[i];
            }
        }
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(pointsY), width / 2,
                height - (int) (height / 20),
                new float[]{0.1f, 0.9f},
                colors));
        g.fillPolygon(pointsX, pointsY, pointsY.length);
    }
}
