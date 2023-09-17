package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Cow {
    public void draw(Graphics2D g, int startX, int startY) {

        int[] x = {startX, startX + 1, startX - 1, startX - 11, startX - 31, startX - 31, startX - 22, startX - 23,
                startX - 23, startX - 34, startX - 36, startX - 38, startX - 38, startX - 43, startX - 45, startX - 44,
                startX - 41, startX - 40, startX - 54, startX - 69, startX - 91, startX - 109, startX - 121, startX - 126,
                startX - 128, startX - 128, startX - 130, startX - 132, startX - 135, startX - 138, startX - 141,
                startX - 143, startX - 147, startX - 150, startX - 152, startX - 151, startX - 150, startX - 149,
                startX - 148, startX - 145, startX - 141, startX - 138, startX - 136, startX - 133, startX - 130,
                startX - 128, startX - 125, startX - 104, startX - 99, startX - 97, startX - 95, startX - 91,
                startX - 88, startX - 85, startX - 82, startX - 76, startX - 76, startX - 75, startX - 68, startX - 67,
                startX - 74, startX - 80, startX - 85, startX - 88, startX - 89, startX - 83, startX - 81, startX - 63,
                startX - 61, startX - 56, startX - 53, startX - 52, startX - 54, startX - 55, startX - 57, startX - 62,
                startX - 70, startX - 75, startX - 76, startX - 76, startX - 73, startX - 72, startX - 69, startX - 67,
                startX - 65, startX - 65, startX - 60, startX - 52, startX - 41, startX - 34, startX - 29, startX - 21,
                startX - 18, startX - 15, startX - 11, startX - 8, startX - 8, startX - 5, startX, startX - 7, startX - 15,
                startX - 19, startX - 19, startX - 17, startX - 11, startX - 3, startX + 1, startX + 4, startX + 7,
                startX + 11, startX + 11, startX - 10, startX - 13, startX - 15, startX - 15, startX - 13, startX - 12,
                startX - 12, startX - 17, startX - 18, startX - 19, startX - 18, startX - 16, startX - 12, startX - 6,
                startX - 2};

        int[] y = {startY, startY + 6, startY + 8, startY + 9, startY + 9, startY + 11, startY + 17, startY + 21, startY + 22,
                startY + 14, startY + 14, startY + 12, startY + 4, startY + 3, startY + 2, startY + 1, startY - 2,
                startY - 6, startY - 17, startY - 26, startY - 46, startY - 60, startY - 68, startY - 72, startY - 75,
                startY - 77, startY - 77, startY - 75, startY - 67, startY - 57, startY - 47, startY - 44, startY - 39,
                startY - 34, startY - 33, startY - 38, startY - 42, startY - 45, startY - 47, startY - 51, startY - 56,
                startY - 64, startY - 73, startY - 79, startY - 83, startY - 85, startY - 87, startY - 114, startY - 123,
                startY - 131, startY - 135, startY - 136, startY - 139, startY - 145, startY - 148, startY - 150,
                startY - 153, startY - 152, startY - 148, startY - 147, startY - 144, startY - 138, startY - 132,
                startY - 125, startY - 120, startY - 120, startY - 122, startY - 137, startY - 138, startY - 138,
                startY - 137, startY - 135, startY - 134, startY - 133, startY - 131, startY - 129, startY - 125,
                startY - 119, startY - 117, startY - 114, startY - 114, startY - 113, startY - 111, startY - 107,
                startY - 104, startY - 99, startY - 96, startY - 89, startY - 80, startY - 80, startY - 81, startY - 89,
                startY - 94, startY - 98, startY - 100, startY - 101, startY - 103, startY - 101, startY - 98, startY - 93,
                startY - 86, startY - 78, startY - 77, startY - 77, startY - 82, startY - 91, startY - 91, startY - 94,
                startY - 94, startY - 91, startY - 89, startY - 75, startY - 73, startY - 68, startY - 62, startY - 60,
                startY - 58, startY - 49, startY - 33, startY - 27, startY - 22, startY - 19, startY - 14, startY - 10,
                startY - 6, startY - 2};

        g.setPaint(new Color(0, 0, 0));
        g.fillPolygon(x, y, x.length);
    }
}
