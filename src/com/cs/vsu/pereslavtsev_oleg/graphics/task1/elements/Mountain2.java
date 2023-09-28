package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain2 {

    private int width;
    private int height;
    private int startY;
    private int partWidth;

    private int[] multiplierX = {-10, 0, 2, 5, 11, 16, 19, 23, 25, 27, 33, 36, 50, 56, 65, 68, 79, 86, 87, 106, 110};
    private int[] multiplierY = {1000, 0, -35, 35, 15, 40, 25, 15, 35, 65, 5, -55, 85, 88, 90, 55, 30, -30, -55, -35, 1000};

    public Mountain2(int width, int height, int startY, int partWidth) {
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
                new Color[]{new Color(182, 29, 52), new Color(200, 45, 66)}));
        g.fillPolygon(pointsX, pointsY, pointsX.length);
    }
}
