package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel {

    private int ufoY = 580;
    private int ufoAmplitude = 0;
    private boolean ufoTop = true;

    private int cowY = 160;
    private int cowAmplitude = 0;
    private boolean cowTop = false;


    public DrawPanel() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                update();
                repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 1000 / 60);
    }

    private void update() {
        if (ufoTop) {
            ufoAmplitude++;
            if (ufoAmplitude == 30) {
                ufoTop = false;
            }
        } else {
            ufoAmplitude--;
            if (ufoAmplitude == -30) {
                ufoTop = true;
            }
        }
        ufoY = 600 + (int) (20 * Math.sin(ufoAmplitude * 0.01f));

        if (cowTop) {
            cowAmplitude++;
            if (cowAmplitude == 50) {
                cowTop = false;
            }
        } else {
            cowAmplitude--;
            if (cowAmplitude == -50) {
                cowTop = true;
            }
        }
        cowY = 160 + (int) (10 * Math.sin(cowAmplitude * 0.01f));
    }

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
        ground.draw(g, 0, 890, 20, 0.01f);

        Cactus cactus1 = new Cactus();
        cactus1.addPaw(100, 720, 50, 400, -1);
        cactus1.addPaw(140, 820, 60, 400, 1);
        cactus1.draw(g, 100, 590, 40, 350);

        Cactus cactus2 = new Cactus();
        cactus2.addPaw(600, 880, 20, 200, -1);
        cactus2.addPaw(620, 830, 16, 150, 1);
        cactus2.draw(g, 600, 790, 20, 100);

        Cactus cactus3 = new Cactus();
        cactus3.addPaw(1200, 790, 20, 300, -1);
        cactus3.addPaw(1224, 840, 30, 400, 1);
        cactus3.draw(g, 1200, 740, 24, 150);

        UFO ufo = new UFO();
        ufo.draw(g, getWidth() / 2, ufoY, 150, 400, 75);

        Cow cow = new Cow();
        cow.draw(g,  getWidth() / 2 - 1130 , cowY);

        Light light = new Light();
        light.draw(g, ufo.getLightsX(), ufo.getLightsY(), 220, 320);

        Tablet tablet = new Tablet();
        tablet.draw(g, 1400, 930);
    }
}
