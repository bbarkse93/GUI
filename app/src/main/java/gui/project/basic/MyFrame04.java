package gui.project.basic;

import javax.swing.*;
import java.awt.*;


public class MyFrame04 extends JFrame{

    public MyFrame04(){
        setTitle("JLabel Test");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(new GridLayout(2, 1));
        
    
        JLabel label1 = new JLabel("Red");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel1 = new JPanel();
        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setPreferredSize(new Dimension(30,30));

        JLabel label2 = new JLabel("Yellow");
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel2 = new JPanel();
        JPanel p2 = new JPanel();
        p2.setBackground(Color.yellow);
        p2.setPreferredSize(new Dimension(30,30));

        JLabel label3 = new JLabel("Green");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel3 = new JPanel();
        JPanel p3 = new JPanel();
        p3.setBackground(Color.green);
        p3.setPreferredSize(new Dimension(30,30));

        JLabel label4 = new JLabel("Blue");
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel4 = new JPanel();
        JPanel p4 = new JPanel();
        p4.setBackground(Color.blue);
        p4.setPreferredSize(new Dimension(30,30));

        add(label1);
        add(label2);
        add(label3);
        add(label4);
       
        panel1.add(p1);
        add(panel1);
        panel2.add(p2);
        add(panel2);
        panel3.add(p3);
        add(panel3);
        panel4.add(p4);
        add(panel4);
      
        
                

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new MyFrame04();
    }
}
