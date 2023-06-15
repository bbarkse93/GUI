package gui.project.ex01.prac;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    public Border() {
        setTitle("BorderLayoutTest");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(new BorderLayout(10, 10));

        JButton b1 = new JButton("Center");

        add(b1, "Center");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Border();

    }
}
