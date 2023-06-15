package gui.project.ex01;

import javax.swing.*;
import java.awt.*;

public class MyFrame01 extends JFrame {

    public MyFrame01() {

        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("버튼 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("버튼 2");
        b2.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame01();

    }
}
