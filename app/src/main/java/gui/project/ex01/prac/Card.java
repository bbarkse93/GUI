package gui.project.ex01.prac;

import javax.swing.*;
import java.awt.*;

public class Card extends JFrame {
    JButton b1, b2, b3;
    Container cPane;
    CardLayout layoutm;

    public Card() {
        setTitle("CardLayoutTest");
        setSize(300, 150);
        setLocation(700, 100);
        cPane = getContentPane();
        layoutm = new CardLayout();
        setLayout(layoutm);

        JButton b1 = new JButton("Card #1");
        JButton b2 = new JButton("Card #2");
        JButton b3 = new JButton("Card #3");

        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(e -> layoutm.next(cPane));
        b2.addActionListener(e -> layoutm.next(cPane));
        b3.addActionListener(e -> layoutm.next(cPane));

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Card();
    }
}
