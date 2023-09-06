package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.*;
import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.primitives.Primitives;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Background background = new Background();
        background.draw(g, getWidth(), getHeight());

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

        Cactus cactus = new Cactus();
        cactus.draw(g, 100, 800, 40, 300);
    }
}
