package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Sun {
    public void draw(Graphics2D g, int x, int y, int r) {
        g.setPaint(new RadialGradientPaint(x + r / 2, y + r / 2, r,
                new float[] {0.1f, 0.9f},
                new Color[]{new Color(255, 125, 75), new Color(255, 0, 37)}));
        g.fillOval(x, y, r, r);
    }
}
