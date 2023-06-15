package gui.project.ex01;

import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("FrameTest");
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
