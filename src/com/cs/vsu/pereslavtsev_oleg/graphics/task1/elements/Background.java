package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

//new Color[] {new Color(200, 40, 70), new Color(220, 75, 95)}));
public class Background {


    public void draw(Graphics2D g, int width, int height) {
        g.setPaint(new LinearGradientPaint(width / 2, 0, width / 2, height,
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(200, 65, 72), new Color(255, 177, 121)}));
        g.fillRect(0, 0, width, height);
    }
}
