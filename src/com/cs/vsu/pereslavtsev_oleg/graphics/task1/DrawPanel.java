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
    private List<Cactus> cactusList;
    private Mountain mountain1;
    private Mountain mountain2;
    private Mountain mountain3;
    private Mountain mountain4;
    private Ground ground;
    private UFO ufo;
    private Light light;
    private Cow cow;
    private Tablet tablet;

    public DrawPanel() {
        background = new Background();
        sun = new Sun(500);
        mountain1 = MountainFactory.createFirst();
        mountain2 = MountainFactory.createSecondary();
        mountain3 = MountainFactory.createThird();
        mountain4 = MountainFactory.createFourth();
        ground = new Ground(0, 0, 20, 0.01f, 0);

        cactusList = new ArrayList<>();
        cactusList.add(CactusFactory.createFirst());
        cactusList.add(CactusFactory.createSecondary());
        cactusList.add(CactusFactory.createThird());


        ufo = new UFO(0, 0, 150, 400, 75);
        cow = new Cow(0, 0);
        light = new Light(220, 320);
        tablet = new Tablet();
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

        sun.draw(g, getWidth() / 2 - 250, partHeight * 11);
        mountain1.draw(g, getWidth(), getHeight(), partHeight, partWidth);
        mountain2.draw(g, getWidth(), getHeight(), partHeight, partWidth);
        mountain3.draw(g, getWidth(), getHeight(), partHeight, partWidth);
        mountain4.draw(g, getWidth(), getHeight(), partHeight, partWidth);
        ground.draw(g, 0, partHeight * 95, partHeight);

        for (Cactus i : cactusList) {
            i.draw(g, partWidth, partHeight);
        }
        ufo.draw(g, partWidth * 55, partHeight * 67);
        cow.draw(g,  partWidth * 48 , partHeight * 93);
        light.draw(g, ufo.getLightsX(), ufo.getLightsY());
        tablet.draw(g, partWidth * 87, partHeight * 100);
    }
}