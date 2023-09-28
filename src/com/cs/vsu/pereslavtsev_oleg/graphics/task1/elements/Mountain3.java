package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Mountain3 {

    private int width;
    private int height;
    private int startY;
    private int partWidth;

    private int[] multiplierX = {-10, 0, 5, 10, 11, 21, 25, 33, 36, 45, 53, 59, 61, 63, 66, 75, 78, 84, 89, 93, 106, 110};
    private int[] multiplierY = {1000, 0, -15, -5, -15, 15, 25, -15, 30, 70, -40, -65, -15, -5, 30, -35, -25, 15, 65, 10, -35, 1000};

    public Mountain3(int width, int height, int startY, int partWidth) {
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
                new Color[]{new Color(125, 8, 33), new Color(162, 20, 33)}));
        g.fillPolygon(pointsX, pointsY, pointsX.length);
    }
}
