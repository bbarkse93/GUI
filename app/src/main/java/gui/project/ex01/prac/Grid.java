package gui.project.ex01.prac;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    public Grid() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(new GridLayout(2, 3, 3, 3));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Grid();
    }
}
