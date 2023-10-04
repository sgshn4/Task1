package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cactus {
    private List<Paw> paws = new ArrayList<>();
    private int width;
    private int height;
    private double x;
    private double y;

    public Cactus(int width, int height, double x, double y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g, int screenWidth, int screenHeight) {
        g.setPaint(new Color(50, 1, 22));
        g.fillRect((int) (screenWidth * x), (int) (screenHeight * y), width, height);
        g.fillOval((int) (screenWidth * x), (int) (screenHeight * y - width / 2), width, width);
        for (Paw i : paws) {
            i.draw(g, screenWidth, screenHeight);
        }
    }

    public void addPaw(int width, int height, int arg, int startX, int startY, int shiftX) {
        paws.add(new Paw(width, height, arg, startX, startY, shiftX));
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
        private int peakX;
        private int peakY;
        private int peakWidth;
        private int arg;
        private int width;
        private int height;
        private int startX;
        private int startY;
        private int shiftX;

        private int[] x;
        private int[] y;


        public Paw(int width, int height, int arg, int startX, int startY, int shiftX) {
            this.arg = arg;
            this.width = width;
            this.height = height;
            this.startX = startX;
            this.startY = startY;
            this.shiftX = shiftX;
        }


        public void draw(Graphics2D g, int screenWidth, int screenHeight) {
            List<Integer> xRight = new ArrayList<>();
            List<Integer> yRight = new ArrayList<>();
            List<Integer> xLeft = new ArrayList<>();
            List<Integer> yLeft = new ArrayList<>();

            int fixX = 0;
            int fixY = 0;

            for (int i = 0; i < 10; i++) {
                if (((int) (Math.pow(i, 3))) / 3 < height / 3) {
                    xRight.add(startX * screenWidth + arg * i * 5 + shiftX);
                    yRight.add(startY * screenHeight - ((int) (Math.pow(i, 3))) / 3);
                    fixX = xRight.get(i);
                } else {
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (((int) (Math.pow(i, 4))) / 4 < height / 3) {
                    xLeft.add(startX * screenWidth + arg * i * 5 + shiftX);
                    yLeft.add(startY * screenHeight - width - ((int) (Math.pow(i, 4))) / 4);
                    fixY = startY * screenHeight - width - ((int) (Math.pow(i, 4))) / 4;
                } else {
                    xLeft.add(fixX);
                    yLeft.add(fixY);
                    peakY = fixY;
                    peakWidth = Math.abs(fixX - (startX * screenWidth + arg * (i - 1) * 5 + shiftX));
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

            g.setPaint(new Color(50, 1, 22));
            g.fillPolygon(x, y, x.length);
            g.fillOval(peakX - peakWidth, peakY - peakWidth / 2, peakWidth, peakWidth);
        }
    }
}
