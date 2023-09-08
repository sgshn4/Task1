package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Tablet {

    public void draw(Graphics2D g, int startX, int startY) {
        g.setPaint(new Color(47, 0, 0));
//        g.rotate(-1.5 * Math.PI / 4, startX, y);
        g.setStroke(new BasicStroke(5));
        g.drawLine(startX, startY, startX, startY - 70);
        int[] x = {startX - 75, startX - 75, startX - 67, startX - 75, startX - 75,
                startX + 75, startX + 75, startX + 68, startX + 75,
                startX + 75, startX + 70, startX + 75, startX + 75};
        int[] y = {startY - 70, startY - 80,startY - 82, startY - 84,
                startY - 120, startY - 120, startY - 109, startY - 107,
                startY - 105, startY - 97, startY - 95, startY - 93, startY - 70};

        g.setStroke(new BasicStroke(1));
        g.fillPolygon(x, y, x.length);

        g.setPaint(new Color(0, 0, 0));
        g.setFont(new Font("Times", Font.BOLD, 18));
        g.drawString("I Want to belive", startX - 70, startY - 90);
    }
}
