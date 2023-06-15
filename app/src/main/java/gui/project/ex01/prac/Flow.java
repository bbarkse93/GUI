package gui.project.ex01.prac;

import javax.swing.*;
import java.awt.*;

public class Flow extends JFrame {
    public Flow() {
        setTitle("FlowLayoutTest");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Flow();
    }
}
