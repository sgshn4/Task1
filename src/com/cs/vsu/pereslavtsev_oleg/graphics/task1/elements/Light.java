package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Light {
    public void draw(Graphics2D g, int x, int y, int width) {
        g.setPaint(new Color(206, 23, 32));
        g.rotate(Math.PI / 4, x, y);
        g.drawOval(x, y, width, 1);
        g.rotate(-Math.PI / 4, x, y);
        g.rotate(2 * Math.PI / 3, x - 30, y + 25);
        g.drawOval(x - 50, y + 25, width - 70, 1);
    }
}
