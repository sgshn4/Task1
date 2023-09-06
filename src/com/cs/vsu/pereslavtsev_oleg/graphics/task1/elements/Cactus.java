package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cactus {

    private List<Paw> paws = new ArrayList<>();

    public void draw(Graphics2D g, int startX, int startY, int width, int height) {
        g.setPaint(new Color(50, 1, 22));
        g.fillRect(startX, startY, width, height);
        g.fillOval(startX, startY - width / 2, width, width);
        for (Paw i : paws) {
            i.draw(g);
        }
    }

    public void addPaw(int startX, int startY, int width, int height, int arg) {
        paws.add(new Paw(startX, startY, width, height, arg));
    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private List<Integer> listCoordinatesBuilder(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i));
        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            result.add(list2.get(i));
        }
        return result;
    }

    class Paw {
        private int startX;
        private int startY;
        private int width;
        private int height;
        private int peakX;
        private int peakY;
        private int peakWidth;
        private int arg;

        private int[] x;
        private int[] y;


        public Paw(int startX, int startY, int width, int height, int arg) {
            this.startX = startX;
            this.startY = startY;
            this.width = width;
            this.height = height;
            this.arg = arg;

            List<Integer> xRight = new ArrayList<>();
            List<Integer> yRight = new ArrayList<>();
            List<Integer> xLeft = new ArrayList<>();
            List<Integer> yLeft = new ArrayList<>();

            int fixX = 0;
            int fixY = 0;

            for (int i = 0; i < 10; i++) {
                if (((int) (Math.pow(i, 3))) / 3 < height / 3) {
                    xRight.add(startX + arg * i * 5);
                    yRight.add(startY - ((int) (Math.pow(i, 3))) / 3);
                    fixX = xRight.get(i);
                } else {
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (((int) (Math.pow(i, 4))) / 4 < height / 3) {
                    xLeft.add(startX + arg * i * 5);
                    yLeft.add(startY - width - ((int) (Math.pow(i, 4))) / 4);
                    fixY = startY - width - ((int) (Math.pow(i, 4))) / 4;
                } else {
                    xLeft.add(fixX);
                    yLeft.add(fixY);
                    peakY = fixY;
                    peakWidth = Math.abs(fixX - (startX + arg * (i - 1) * 5));
                    if (arg == 1) {
                        peakX = fixX;
                    } else {
                        peakX = fixX + peakWidth;
                    }
                    break;
                }
            }
            x = listToArray(listCoordinatesBuilder(xLeft, xRight));
            y = listToArray(listCoordinatesBuilder(yLeft, yRight));
        }

        public void draw(Graphics2D g) {
            g.setPaint(new Color(50, 1, 22));
            g.fillPolygon(x, y, x.length);
            g.fillOval(peakX - peakWidth, peakY - peakWidth / 2, peakWidth, peakWidth);
        }
    }
}
