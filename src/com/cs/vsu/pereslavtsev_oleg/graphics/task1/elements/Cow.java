package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

import java.awt.*;

public class Cow {
    public void draw(Graphics2D g, int startX, int startY) {

        int[] x = {startX + 1051, startX + 1052, startX + 1050, startX + 1040, startX + 1020, startX + 1020, startX + 1029,
                startX + 1028, startX + 1028, startX + 1017, startX + 1015, startX + 1013, startX + 1013, startX + 1008,
                startX + 1006, startX + 1007, startX + 1010, startX + 1011, startX + 997, startX + 982, startX + 960,
                startX + 942, startX + 930, startX + 925, startX + 923, startX + 923, startX + 921, startX + 919,
                startX + 916, startX + 913, startX + 910, startX + 908, startX + 904, startX + 901, startX + 899,
                startX + 900, startX + 901, startX + 902, startX + 903, startX + 906, startX + 910, startX + 913,
                startX + 915, startX + 918, startX + 921, startX + 923, startX + 926, startX + 947, startX + 952,
                startX + 954, startX + 956, startX + 960, startX + 963, startX + 966, startX + 969, startX + 975,
                startX + 975, startX + 976, startX + 983, startX + 984, startX + 977, startX + 971, startX + 966,
                startX + 963, startX + 962, startX + 968, startX + 970, startX + 988, startX + 990, startX + 995,
                startX + 998, startX + 999, startX + 997, startX + 996, startX + 994, startX + 989, startX + 981,
                startX + 976, startX + 975, startX + 975, startX + 978, startX + 979, startX + 982, startX + 984,
                startX + 986, startX + 986, startX + 991, startX + 999, startX + 1010, startX + 1017, startX + 1022,
                startX + 1030, startX + 1033, startX + 1036, startX + 1040, startX + 1043, startX + 1043, startX + 1046,
                startX + 1051, startX + 1044, startX + 1036, startX + 1032, startX + 1032, startX + 1034, startX + 1040,
                startX + 1048, startX + 1052, startX + 1055, startX + 1058, startX + 1062, startX + 1062, startX + 1041,
                startX + 1038, startX + 1036, startX + 1036, startX + 1038, startX + 1039, startX + 1039, startX + 1034,
                startX + 1033, startX + 1032, startX + 1033, startX + 1035, startX + 1039, startX + 1045, startX + 1049};

        int[] y = {startY + 689, startY + 695, startY + 697, startY + 698, startY + 698, startY + 700, startY + 706,
                startY + 710, startY + 711, startY + 703, startY + 703, startY + 701, startY + 693, startY + 692,
                startY + 691, startY + 690, startY + 687, startY + 683, startY + 672, startY + 663, startY + 643,
                startY + 629, startY + 621, startY + 617, startY + 614, startY + 612, startY + 612, startY + 614,
                startY + 622, startY + 632, startY + 642, startY + 645, startY + 650, startY + 655, startY + 656,
                startY + 651, startY + 647, startY + 644, startY + 642, startY + 638, startY + 633, startY + 625,
                startY + 616, startY + 610, startY + 606, startY + 604, startY + 602, startY + 575, startY + 566,
                startY + 558, startY + 554, startY + 553, startY + 550, startY + 544, startY + 541, startY + 539,
                startY + 536, startY + 537, startY + 541, startY + 542, startY + 545, startY + 551, startY + 557,
                startY + 564, startY + 569, startY + 569, startY + 567, startY + 552, startY + 551, startY + 551,
                startY + 552, startY + 554, startY + 555, startY + 556, startY + 558, startY + 560, startY + 564,
                startY + 570, startY + 572, startY + 575, startY + 575, startY + 576, startY + 578, startY + 582,
                startY + 585, startY + 590, startY + 593, startY + 600, startY + 609, startY + 609, startY + 608,
                startY + 600, startY + 595, startY + 591, startY + 589, startY + 588, startY + 586, startY + 588,
                startY + 591, startY + 596, startY + 603, startY + 611, startY + 612, startY + 612, startY + 607,
                startY + 598, startY + 598, startY + 595, startY + 595, startY + 598, startY + 600, startY + 614,
                startY + 616, startY + 621, startY + 627, startY + 629, startY + 631, startY + 640, startY + 656,
                startY + 662, startY + 667, startY + 670, startY + 675, startY + 679, startY + 683, startY + 687};

        g.setPaint(new Color(0, 0, 0));
        g.fillPolygon(x, y, x.length);
    }
}
