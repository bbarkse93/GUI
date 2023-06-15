package gui.project.ex01;

import javax.swing.*;
import java.awt.*;

public class LabelTest extends JFrame {
    private JPanel panel;
    private JLabel label1, label2;

    public LabelTest() {
        setTitle("레이블 테스트");
        setSize(400, 150);
        setLocation(700, 100);

        panel = new JPanel();
        label1 = new JLabel("Color Label");
        label1.setForeground(Color.BLUE);
        label2 = new JLabel("Font Label");
        label2.setFont(new Font("Arial", Font.ITALIC, 30));
        label2.setForeground(Color.ORANGE);
        panel.add(label1);
        panel.add(label2);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new LabelTest();
    }
}