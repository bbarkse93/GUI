package gui.project.ex01;

import javax.swing.*;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ImageLabelTest() {
        setTitle("레이블 테스트");
        setSize(400, 300);
        setLocation(700, 100);

        panel = new JPanel();
        label = new JLabel("cat");
        ImageIcon icon = new ImageIcon("C:\\workspace\\img\\cat.jpg");
        label.setIcon(icon);

        button = new JButton("자세한 정보를 보려면 클릭하세요!");
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageLabelTest();
    }
}
