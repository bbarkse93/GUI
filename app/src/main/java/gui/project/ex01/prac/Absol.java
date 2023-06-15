package gui.project.ex01.prac;

import javax.swing.*;

public class Absol extends JFrame {
    private JButton b1, b2;

    public Absol() {
        setTitle("Absolute Position Test");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(null);

        b1 = new JButton("Button #1");
        add(b1);
        b1.setLocation(50, 30);
        b1.setSize(90, 50);

        b2 = new JButton("Button #1");
        add(b2);
        b2.setBounds(180, 30, 90, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Absol();
    }
}
