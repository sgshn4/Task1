package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Light {
    public void draw(Graphics2D g, int[] startX, int[] startY, int width, int height) {
        g.setPaint(new Color(0, 0, 0));
        g.drawLine(startX[0], startY[0], (int)(startX[0] - width * 0.6), startY[0] + height - 20);
        g.drawLine(startX[1], startY[1], (int)(startX[1] + width * 1.3), startY[1] + height);
    }
}
