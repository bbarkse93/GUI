package gui.project.basic;


import java.awt.*;
import javax.swing.*;


public class MyFrame01 extends JFrame{
    
    public MyFrame01 (){
        setTitle("My Frame");
        setSize(300, 150);
        setLocation(700, 100);
        setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        JLabel label = new JLabel("자바는 재미있나요?");
        JButton button1 = new JButton("Yes");
        JButton button2 = new JButton("No");    

        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new MyFrame01();
    }
}
