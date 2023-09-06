package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class UFO {
    public void draw(Graphics2D g, int x, int y, int r, int width, int height) {
        g.setPaint(new Color(206, 23, 32));
        g.rotate(-Math.PI / 9, x - 150, y - 50);
        g.fillArc(x - width / 2 - r / 2, y - height / 2 - r / 2, r, r, 0, 180);
        g.setPaint(new Color(0, 0, 0));
        g.setStroke(new BasicStroke(3));
        g.drawArc(x - width / 2 - r / 2, y - height / 2 - r / 2, r, r, 0, 180);
        g.setStroke(new BasicStroke(1));
        g.fillOval(x - width, y - height, width, height);
        g.setPaint(new Color(206, 23, 32));
        g.drawOval(x - width, y - height / 2, width, 1);

        for (int i = 0; i < width; i += height / 1.5) {
            g.fillOval(x - width + i + 10, y - height / 2 - height / 6, height / 3, height / 3);
        }

    }
}
