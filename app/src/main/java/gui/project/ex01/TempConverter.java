package gui.project.ex01;

import javax.swing.*;


public class TempConverter extends JFrame{

    public TempConverter(){
        

        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("화씨온도");
        JLabel label2 = new JLabel("섭씨온도");
        JTextField field1 = new JTextField(20);
        JTextField field2 = new JTextField(20);
        JButton button = new JButton("변환");

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);

        setSize(300, 150);
        setTitle("온도변환기");
        setLocation(700, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TempConverter();
    }
}
