package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int r;

    public Sun(int r) {
        this.r = r;
    }

    public void draw(Graphics2D g, int x, int y) {
        g.setPaint(new RadialGradientPaint(x + r / 2, y + r / 2, r,
                new float[] {0.1f, 0.9f},
                new Color[]{new Color(255, 125, 75), new Color(255, 0, 37)}));
        g.fillOval(x, y, r, r);
    }
}
