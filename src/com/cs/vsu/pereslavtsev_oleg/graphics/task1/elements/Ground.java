package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;


import java.awt.*;

public class Ground {
    private int startX;
    private int startY;
    private int arg1;
    private float arg2;
    private int arg3;

    public Ground(int startX, int startY, int arg1, float arg2, int arg3) {
        this.startX = startX;
        this.startY = startY;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public void draw(Graphics2D g, int startX, int startY, int arg3) {
        int[] x = new int[1702];
        int[] y = new int[1702];
        x[0] = startX - 10;
        x[1701] = startX + 1710;
        y[0] = startY + arg3 * 111;
        y[1701] = startY + arg3 * 111;
        for (int i = 1; i < 1701; i++) {
            x[i] = startX + i;
            y[i] = startY + (int)(arg1 * Math.sin(i * arg2));
        }
        g.setPaint(new Color(50, 1, 22));
        g.fillPolygon(x, y, 1702);
    }
}
