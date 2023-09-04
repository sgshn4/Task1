package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.Background;
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
    }
}
