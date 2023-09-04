package com.cs.vsu.pereslavtsev_oleg.graphics.task1;

import com.cs.vsu.pereslavtsev_oleg.graphics.task1.DrawPanel;

import javax.swing.*;

public class MainWindow extends JFrame {
    private final DrawPanel drawPanel;

    public MainWindow() {
        drawPanel = new DrawPanel();
        this.add(drawPanel);
    }
}
