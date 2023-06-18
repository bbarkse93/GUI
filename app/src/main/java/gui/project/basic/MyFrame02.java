package gui.project.basic;

import javax.swing.*;
import java.awt.*;


public class MyFrame02 extends JFrame{

    public MyFrame02(){
        setTitle("My Frame");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        JLabel label = new JLabel("카운터값");
        JTextField field = new JTextField(10);
        JButton button = new JButton("검색");

        panel.add(label);
        panel.add(field);
        panel.add(button);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame02();
    }    
}
