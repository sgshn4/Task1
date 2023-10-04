package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel {

    private int partWidth;
    private int partHeight;

    private Background background;
    private Sun sun;
    private List<Mountain> mountains;
    private List<Cactus> cactusList;
    private Ground ground;
    private UFO ufo;
    private Light light;
    private Cow cow;
    private Tablet tablet;

    public DrawPanel() {
        background = new Background();
        sun = new Sun(500, 11);

        mountains = new ArrayList<>();
        mountains.add(MountainFactory.createFirst());
        mountains.add(MountainFactory.createSecondary());
        mountains.add(MountainFactory.createThird());
        mountains.add(MountainFactory.createFourth());

        ground = new Ground(0, 95, 20, 0.01f);

        cactusList = new ArrayList<>();
        cactusList.add(CactusFactory.createFirst());
        cactusList.add(CactusFactory.createSecondary());
        cactusList.add(CactusFactory.createThird());


        ufo = new UFO(55, 67, 150, 400, 75);
        cow = new Cow(48, 92);
        light = new Light(220, 320);
        tablet = new Tablet(87, 100);
    }
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        partWidth = getWidth() / 100;
        partHeight = getHeight() / 100;

        //Anti-aliasing
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        background.draw(g, getWidth(), getHeight());
        sun.draw(g, getWidth(), partHeight);

        for (Mountain i : mountains) {
            i.draw(g, getWidth(), getHeight(), partHeight, partWidth);
        }

        ground.draw(g, 0, partHeight);

        for (Cactus i : cactusList) {
            i.draw(g, partWidth, partHeight);
        }

        ufo.draw(g, partWidth, partHeight);
        cow.draw(g,  partWidth, partHeight);
        light.draw(g, ufo.getLightsX(), ufo.getLightsY());
        tablet.draw(g, partWidth, partHeight);
    }
}