package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        //Anti-aliasing
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Background background = new Background();
        background.draw(g, getWidth(), getHeight());

        Sun sun = new Sun();
        sun.draw(g, getWidth() / 2 - 250, 100, 500);

        Mountain1 mountain1 = new Mountain1();
        mountain1.draw(g, getWidth(), getHeight(), -20);

        Mountain2 mountain2 = new Mountain2();
        mountain2.draw(g, getWidth(), getHeight(), -40);

        Mountain3 mountain3 = new Mountain3();
        mountain3.draw(g, getWidth(), getHeight(), -40);

        Mountain4 mountain4 = new Mountain4();
        mountain4.draw(g, getWidth(), getHeight(), -50);

        Ground ground = new Ground();
        ground.draw(g, getWidth(), getHeight(), 0, 900, 20, 0.01f);

        Cactus cactus1 = new Cactus();
        cactus1.addPaw(100, 730, 50, 400, -1);
        cactus1.addPaw(140, 830, 60, 400, 1);
        cactus1.draw(g, 100, 600, 40, 350);

        Cactus cactus2 = new Cactus();
        cactus2.addPaw(600, 890, 20, 200, -1);
        cactus2.addPaw(620, 840, 16, 150, 1);
        cactus2.draw(g, 600, 800, 20, 100);

        Cactus cactus3 = new Cactus();
        cactus3.addPaw(1200, 800, 20, 300, -1);
        cactus3.addPaw(1224, 850, 30, 400, 1);
        cactus3.draw(g, 1200, 750, 24, 150);
    }
}
