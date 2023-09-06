package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.Utils;

import java.awt.*;

public class Ground {
    public void draw(Graphics2D g, int width, int height, int startX, int startY, int arg1, float arg2) {
        int[] x = new int[1702];
        int[] y = new int[1702];
        x[0] = startX + -10;
        x[1701] = startX + 1710;
        y[0] = startY + 1000;
        y[1701] = startY + 1000;
        for (int i = 1; i < 1701; i++) {
            x[i] = startX + i;
            y[i] = startY + (int)(arg1 * Math.sin(i * arg2));
        }
        g.setPaint(new Color(50, 1, 22));
        g.fillPolygon(x, y, 1702);
    }
}
