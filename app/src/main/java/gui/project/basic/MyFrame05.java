package gui.project.basic;

import javax.swing.*;
import java.awt.*;


public class MyFrame05 extends JFrame{

    public MyFrame05(){
        setTitle("BMI 계산기");
        setSize(400, 200);
        setLocation(700, 100);
        setLayout(new FlowLayout(FlowLayout.LEFT, 0,5));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JLabel l1 = new JLabel("나의 BMI지수는 얼마나 될까?");
        JLabel l2 = new JLabel("나의 체중(kg):   ");
        TextField t1 = new TextField(20);
        JLabel l3 = new JLabel("나의 키(m):        ");
        TextField t2 = new TextField(20);
        JButton b1 = new JButton("  BMI 확인하기  ");

        p1.add(l1);
        p2.add(l2);
        p2.add(t1);
        p3.add(l3);
        p3.add(t2);
        p4.add(b1);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame05();
    }
}
