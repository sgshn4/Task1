package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Light {

    private int finishX1;
    private int finishX2;
    private int finishY1;
    private int finishY2;

    public void draw(Graphics2D g, int[] startX, int[] startY, int width, int height) {
        g.setPaint(new Color(0, 0, 0));
        finishX1 = (int)(startX[0] - width * 0.6);
        finishY1 = startY[0] + height - 20;
        finishX2 = (int)(startX[1] + width * 1.3);
        finishY2 = startY[1] + height;

        g.drawLine(startX[0], startY[0], finishX1, finishY1 - 2);
        g.drawLine(startX[1], startY[1], finishX2, finishY2);

        g.setPaint(new Color(206, 23, 32));
        g.setStroke(new BasicStroke(3));
        g.fillOval(finishX1, finishY1 - 14, finishX2 - finishX1, 25);

        g.setPaint(new Color(206, 23, 32, 30));
        int[] x = new int[4];
        int[] y = new int[4];
        x[0] = startX[0];
        y[0] = startY[0];
        x[1] = finishX1;
        y[1] = finishY1;
        x[2] = finishX2;
        y[2] = finishY2;
        x[3] = startX[1];
        y[3] = startY[1];
        g.fillPolygon(x, y, x.length);
    }

}
