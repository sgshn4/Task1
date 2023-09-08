package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Light {


    public void draw(Graphics2D g, int[] startX, int[] startY, int width, int height) {
        g.setPaint(new Color(0, 0, 0));

        //Math
        int finishX1 = (int)(startX[0] - width * 0.6);
        int finishY1 = startY[0] + height - 20;
        int finishX2 = (int)(startX[1] + width * 1.3);
        int finishY2 = startY[1] + height;

        //Lines
        g.drawLine(startX[0], startY[0], finishX1, finishY1 - 2);
        g.drawLine(startX[1], startY[1], finishX2, finishY2);

        //Ground part
        g.setPaint(new Color(206, 23, 32));
        g.setStroke(new BasicStroke(3));
        g.fillOval(finishX1, finishY1 - 14, finishX2 - finishX1, 25);

        //Filling space
        g.setPaint(new Color(206, 23, 32, 30));
        int[] x = {startX[0], finishX1, finishX2, startX[1]};
        int[] y = {startY[0], finishY1, finishY2, startY[1]};
        g.fillPolygon(x, y, x.length);
    }

}
