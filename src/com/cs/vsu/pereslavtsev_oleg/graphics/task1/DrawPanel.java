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

    private int partWidth;
    private int partHeight;


    public DrawPanel() {
        //Animations
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
        ufoY = partHeight * 66 + (int) (20 * Math.sin(ufoAmplitude * 0.01f));

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
        cowY = partHeight * 94 + (int) (10 * Math.sin(cowAmplitude * 0.01f));
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        partWidth = getWidth() / 100;
        partHeight = getHeight() / 100;

        //Anti-aliasing
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Background background = new Background();
        background.draw(g, getWidth(), getHeight());

        Sun sun = new Sun();
        sun.draw(g, getWidth() / 2 - 250, partHeight * 11, 500);

        Mountain1 mountain1 = new Mountain1();
        mountain1.draw(g, getWidth(), getHeight(), partHeight * 48);

        Mountain2 mountain2 = new Mountain2();
        mountain2.draw(g, getWidth(), getHeight(), partHeight * 58);

        Mountain3 mountain3 = new Mountain3();
        mountain3.draw(g, getWidth(), getHeight(), partHeight * 75);

        Mountain4 mountain4 = new Mountain4();
        mountain4.draw(g, getWidth(), getHeight(), partHeight * 87);

        Ground ground = new Ground();
        ground.draw(g, 0, partHeight * 95, 20, 0.01f, partHeight);

        Cactus cactus1 = new Cactus();
        cactus1.addPaw(partWidth * 6, partHeight * 80, 50, 400, -1);
        cactus1.addPaw(partWidth * 6 + 40, partHeight * 91, 60, 400, 1);
        cactus1.draw(g, partWidth * 6, partHeight * 65, 40, 350);

        Cactus cactus2 = new Cactus();
        cactus2.addPaw(partWidth * 35, partHeight * 92, 20, 200, -1);
        cactus2.addPaw(partWidth * 35 + 20, partHeight * 88, 16, 150, 1);
        cactus2.draw(g, partWidth * 35, partHeight * 85, 20, 100);

        Cactus cactus3 = new Cactus();
        cactus3.addPaw(partWidth * 75, partHeight * 87, 20, 300, -1);
        cactus3.addPaw(partWidth * 75 + 24, partHeight * 94, 30, 300, 1);
        cactus3.draw(g, partWidth * 75, partHeight * 82, 24, 150);

        UFO ufo = new UFO();
        ufo.draw(g, partWidth * 55, ufoY, 150, 400, 75);

        Cow cow = new Cow();
        cow.draw(g,  partWidth * 50 , cowY);

        Light light = new Light();
        light.draw(g, ufo.getLightsX(), ufo.getLightsY(), 220, 320);

        Tablet tablet = new Tablet();
        tablet.draw(g, partWidth * 87, partHeight * 100);
    }
}
