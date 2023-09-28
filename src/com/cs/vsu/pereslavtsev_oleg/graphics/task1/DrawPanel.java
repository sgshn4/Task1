package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel {

    private int ufoY = 580;
    private int ufoAmplitude = 0;
    private boolean ufoTop = true;

    private int cowY = 160;
    private int cowAmplitude = 0;
    private boolean cowTop = false;

    private int partWidth;
    private int partHeight;

    private Background background;
    private Sun sun;
    private List<Cactus> cactusList;
    private Mountain1 mountain1;
    private Mountain2 mountain2;
    private Mountain3 mountain3;
    private Mountain4 mountain4;
    private Ground ground;
    private UFO ufo;
    private Light light;
    private Cow cow;
    private Tablet tablet;

    public DrawPanel() {
        //Animations
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
//                update();
                repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 10);

        background = new Background();
        sun = new Sun(500);
        mountain1 = new Mountain1(0, 0, 0, 0);
        mountain2 = new Mountain2(0, 0, 0, 0);
        mountain3 = new Mountain3(0, 0, 0, 0);
        mountain4 = new Mountain4(0, 0, 0, 0);
        ground = new Ground(0, 0, 20, 0.01f, 0);

        cactusList = new ArrayList<>();
        cactusList.add(new Cactus(40, 350));
        cactusList.get(0).addPaw(50, 400, -1);
        cactusList.get(0).addPaw(60, 400, 1);

        cactusList.add(new Cactus(20, 100));
        cactusList.get(1).addPaw(20, 200, -1);
        cactusList.get(1).addPaw(16, 150, 1);

        cactusList.add(new Cactus(24, 150));
        cactusList.get(2).addPaw(20, 300, -1);
//        cactusList.get(2).setCoordinatesToPaw(0, );
        cactusList.get(2).addPaw(30, 300, 1);


        ufo = new UFO(0, 0, 150, 400, 75);
        cow = new Cow(0, 0);
        light = new Light(220, 320);
        tablet = new Tablet();
    }

    int t = 0;
    private void update() {
        t++;
        if (ufoTop) {
            ufoAmplitude++;
            if (ufoAmplitude == 15) {
                ufoTop = false;
            }
        } else {
            ufoAmplitude--;
            if (ufoAmplitude == -15) {
                ufoTop = true;
            }
        }
        ufoY = partHeight * 56 + (int) (20 * Math.sin(t * 0.01f));

        if (cowTop) {
            cowAmplitude++;
            if (cowAmplitude == 25) {
                cowTop = false;
            }
        } else {
            cowAmplitude--;
            if (cowAmplitude == -25) {
                cowTop = true;
            }
        }
        cowY = partHeight * 90 + (int) (10 * Math.sin(cowAmplitude * 0.1f));
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
        mountain1.draw(g, getWidth(), getHeight(), partHeight * 48, partWidth);
        mountain2.draw(g, getWidth(), getHeight(), partHeight * 58, partWidth);
        mountain3.draw(g, getWidth(), getHeight(), partHeight * 75, partWidth);
        mountain4.draw(g, getWidth(), getHeight(), partHeight * 87, partWidth);
        ground.draw(g, 0, partHeight * 95, partHeight);

        cactusList.get(0).setCoordinatesToPaw(0, partWidth * 6, partHeight * 80);
        cactusList.get(0).setCoordinatesToPaw(1, partWidth * 6 + 40, partHeight * 91);
        cactusList.get(0).draw(g, partWidth * 6, partHeight * 65);
        cactusList.get(1).setCoordinatesToPaw(0, partWidth * 35, partHeight * 89);
        cactusList.get(1).setCoordinatesToPaw(1, partWidth * 35 + 20, partHeight * 87);
        cactusList.get(1).draw(g, partWidth * 35, partHeight * 85);
        cactusList.get(2).setCoordinatesToPaw(0, partWidth * 75, partHeight * 87);
        cactusList.get(2).setCoordinatesToPaw(1, partWidth * 75 + 24, partHeight * 94);
        cactusList.get(2).draw(g, partWidth * 75, partHeight * 82);
        ufo.draw(g, partWidth * 55, partHeight * 67);
        cow.draw(g,  partWidth * 48 , partHeight * 93);
        light.draw(g, ufo.getLightsX(), ufo.getLightsY());
        tablet.draw(g, partWidth * 87, partHeight * 100);
    }
}