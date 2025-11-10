package main.java.com.globfoodapp;

import java.awt.*;
import javax.swing.*;

import main.java.com.globfoodapp.ui.Homepage;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GlobFood");
            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(new Homepage());
            frame.pack();
            frame.setVisible(true);
        });

    }
}
