package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class UFO {

    private int[] lightsX = new int[2];
    private int[] lightsY = new int[2];

    private int startX;
    private int startY;
    private int r;
    private int width;
    private int height;

    public UFO(int startX, int startY, int r, int width, int height) {
        this.startX = startX;
        this.startY = startY;
        this.r = r;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g, int multiplierX, int multiplierY) {
        //Cabin
        g.setPaint(new Color(206, 23, 32));
        g.rotate(-Math.PI / 9, multiplierX * startX - 150, multiplierY * startY - 50);
        g.fillArc(multiplierX * startX - width / 2 - r / 2, multiplierY * startY - height / 2 - r / 2, r, r, 0, 180);

        //Body
        g.setPaint(new Color(0, 0, 0));
        g.setStroke(new BasicStroke(3));
        g.drawArc(multiplierX * startX - width / 2 - r / 2, multiplierY * startY - height / 2 - r / 2, r, r, 0, 180);

        //Outline
        g.setStroke(new BasicStroke(1));
        g.fillOval(multiplierX * startX - width, multiplierY * startY - height, width, height);
        g.setPaint(new Color(206, 23, 32));

        //Backlight
        g.drawOval(multiplierX * startX - width, multiplierY * startY - height / 2, width, 1);

        for (int i = 0; i < width; i += height / 1.5) {
            g.fillOval(multiplierX * startX - width + i + 10, multiplierY * startY - height / 2 - height / 6, height / 3, height / 3);
        }

        g.rotate(Math.PI / 9, multiplierX * startX - 150, multiplierY * startY - 50);

        //Coordinates for light
        lightsX[0] = multiplierX * startX - width / 2 - 25;
        lightsX[1] = multiplierX * startX - width / 2 + 35;
        lightsY[0] = multiplierY * startY + height / 2 - 8;
        lightsY[1] = multiplierY * startY + height / 2 - 31;
    }

    public int[] getLightsX() {
        return lightsX;
    }

    public int[] getLightsY() {
        return lightsY;
    }
}
