package gui.project.basic;

import javax.swing.*;
import java.awt.*;

public class MyFrame03 extends JFrame{

    public MyFrame03() {

        setTitle("MyFrame");
        setSize(400, 200);
        setLocation(700, 100);
        setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        JButton button1 = new JButton("1일");
        JButton button2 = new JButton("2일");
        JButton button3 = new JButton("3일");
        JButton button4 = new JButton("4일");
        JButton button5 = new JButton("5일");


        panel.add(label);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        add(panel);
        add(panel2);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame03();
    }
}
