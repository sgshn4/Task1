package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain1 {

    private int width;
    private int height;
    private int startY;
    private int partWidth;

    private int[] multiplierX = {-1, 0, 3, 8, 16, 17, 21, 22, 26, 30, 33, 48, 56, 61, 71, 75, 81, 83, 87, 106, 110};
    private int[] multiplierY = {1000, 0, 20, 0, 10, 20, -25, -60, -10, -5, -40, 70, 55, 90, 10, 0, -55, -90,
            -200, -230, 1000};

    public Mountain1(int width, int height, int startY, int partWidth) {
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

        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(pointsY), width / 2,
                height - (int) (height / 20),
                new float[]{0.1f, 0.9f},
                new Color[]{new Color(197, 13, 52), new Color(252, 71, 88)}));
        g.fillPolygon(pointsX, pointsY, pointsY.length);
    }
}
