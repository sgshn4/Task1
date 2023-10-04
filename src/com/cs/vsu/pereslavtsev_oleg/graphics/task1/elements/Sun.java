package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Sun {
    private int y;
    private int r;

    public Sun(int r, int y) {
        this.r = r;
        this.y = y;
    }

    public void draw(Graphics2D g, int width, int multiplierY) {
        g.setPaint(new RadialGradientPaint(width / 2, y * multiplierY + r / 2, r,
                new float[] {0.1f, 0.9f},
                new Color[]{new Color(255, 125, 75), new Color(255, 0, 37)}));
        g.fillOval(width / 2 - r / 2, y * multiplierY, r, r);
    }
}
