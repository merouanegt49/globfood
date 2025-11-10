package main.java.com.globfoodapp.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;

public class Homepage extends JPanel {

    private Object swingconstants;
    JLabel Product1 = new JLabel("pizza", SwingConstants.CENTER);
    JLabel Product2 = new JLabel("burger", SwingConstants.CENTER);
    JButton B1 = new JButton("Add to cart");
    JButton B2 = new JButton("Add 2 cart");

    public Homepage() {

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing between components
        gbc.fill = GridBagConstraints.NONE;

        Font buttonFont = new Font("Arial", Font.BOLD, 10);
        B1.setFont(buttonFont);
        B2.setFont(buttonFont);

        add(Product1);
        add(B1);
        add(Product2);
        add(B2);

        B1.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Item added to cart!");
        });
    }

}
