package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain4 {

    private int width;
    private int height;
    private int startY;
    private int partWidth;

    private int[] multiplierX = {-10, 0, 3, 11, 23, 31, 35, 49, 59, 68, 71, 75, 90, 93, 106, 110};
    private int[] multiplierY = {1000, 0, -20, 60, -20, -10, -15, 10, 20, -60, -65, -15, -30, -35, -27, 1000};

    public Mountain4(int width, int height, int startY, int partWidth) {
        this.width = width;
        this.height = height;
        this.startY = startY;
        this.partWidth = partWidth;
    }

    public void draw(Graphics2D g, int width, int height, int startY, int partWidth) {
        int[] pointsX = new int[multiplierX.length];
        int[] pointsY = new int[multiplierY.length];
        for (int i = 0; i < pointsX.length; i++) {
            pointsX[i] = partWidth * multiplierX[i];
            if (i == 0 || i == multiplierX.length - 1) {
                pointsY[i] = 1000;
            } else {
                pointsY[i] = startY + multiplierY[i];
            }
        }
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(pointsY), width / 2, height - (int) (height / 20),
                new float[]{0.1f, 0.9f},
                new Color[]{new Color(80, 5, 25), new Color(110, 2, 36)}));
        g.fillPolygon(pointsX, pointsY, pointsX.length);
    }
}
