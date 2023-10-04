package com.cs.vsu.pereslavtsev_oleg.graphics.task1.elements;

public abstract class CactusFactory {
    public static Cactus createFirst() {
        Cactus cactus = new Cactus(40, 350, 6, 65);
        cactus.addPaw(50, 400, -1, 6, 80,0);
        cactus.addPaw(60, 400, 1, 6, 91, 40);
        return cactus;
    }

    public static Cactus createSecondary() {
        Cactus cactus = new Cactus(20, 100, 35, 85);
        cactus.addPaw(20, 200, -1, 35, 89,0);
        cactus.addPaw(16, 150, 1, 35, 87, 20);
        return cactus;
    }

    public static Cactus createThird() {
        Cactus cactus = new Cactus(24, 150, 75, 82);
        cactus.addPaw(20, 300, -1, 75, 87,0);
        cactus.addPaw(30, 300, 1, 75, 94, 24);
        return cactus;
    }
}
