package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

//new Color[] {new Color(200, 40, 70), new Color(220, 75, 95)}));
public class Background {

    private Graphics2D g;
    private int width;
    private int height;

    public void draw(Graphics2D g, int width, int height) {
        this.g = g;
        this.width = width;
        this.height = height;
        background();
        firstMountain();
        secondMountain();
    }

    private void background() {
        g.setPaint(new LinearGradientPaint(width / 2, 0, width / 2, height,
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(200, 65, 72), new Color(255, 177, 121)}));
        g.fillRect(0, 0, width, height);
    }

    private void firstMountain() {
        int[] x = {-10, 0, 40, 130, 260, 270, 340, 345, 420, 490, 540, 780, 910, 985, 1150, 1200, 1300, 1330, 1400, 1700, 1710};
        int[] y = {1000, 430, 450, 430, 440, 450, 405, 370, 390, 425, 390, 500, 485, 520, 440, 430, 375, 340, 230, 200, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, 230, width / 2, height - (int) (height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(197, 13, 52), new Color(252, 71, 88)}));
        g.fillPolygon(x, y, 21);
    }

    private void secondMountain() {
        int[] x = {-10, 0, 30, 80, 180, 260, 310, 370, 410, 445, 540, 580, 810, 910, 1050, 1100, 1270, 1380, 1400, 1700, 1710};
        int[] y = {1000, 615, 580, 650, 630, 655, 640, 630, 650, 680, 620, 560, 700, 670, 705, 670, 645, 585, 560, 580, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, 560, width / 2, height - (int)(height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(150, 23, 64), new Color(200, 45, 66)}));
        g.fillPolygon(x, y, 21);
    }
}
