package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

//new Color[] {new Color(200, 40, 70), new Color(220, 75, 95)}));
public class Background {

    public void draw(Graphics2D g, int width, int height) {
        int[] x = {-10, 0, 40, 130, 260, 270, 340, 345, 420, 490, 540, 780, 910, 985, 1150, 1200, 1300, 1330, 1400, 1700, 1710};
        int[] y = {1000, 430, 450, 430, 440, 450, 405, 370, 390, 425, 390, 500, 485, 520, 440, 430, 375, 340, 230, 200, 1000};
        g.setPaint(new LinearGradientPaint(width / 2, 230, width / 2, height - (int) (height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(197, 13, 52), new Color(229, 123, 135)}));
        g.fillPolygon(x, y, 21);
    }
}
