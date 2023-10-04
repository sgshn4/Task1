package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Tablet {

    private int[] shiftX = {-75, -75, -67, -75, -75, 75, 75, 68, 75, 75, 70, 75, 75};
    private int[] shiftY = {-70, -80, -82, -84, -120, -120, -109, -107, -105, -97, -95, -93, -70};
    private int startX;
    private int startY;

    public Tablet(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public void draw(Graphics2D g, int multiplierX, int multiplierY) {
        g.setPaint(new Color(47, 0, 0));

        //Draw leg
        g.setStroke(new BasicStroke(5));
        g.drawLine(multiplierX * startX, multiplierY * startY, multiplierX * startX, startY * multiplierY - 70);

        //Draw deck
        int[] pointsX = new int[shiftX.length];
        int[] pointsY = new int[shiftY.length];
        for (int i = 0; i < shiftX.length; i++) {
            pointsX[i] = shiftX[i] + multiplierX * startX;
            pointsY[i] = shiftY[i] + multiplierY * startY;
        }
        g.setStroke(new BasicStroke(1));
        g.fillPolygon(pointsX, pointsY, pointsX.length);

        //Draw String
        g.setPaint(new Color(0, 0, 0));
        g.setFont(new Font("Times", Font.BOLD, 16));
        g.drawString("I Want to belive", multiplierX * startX - 70, multiplierY * startY - 90);
    }
}
