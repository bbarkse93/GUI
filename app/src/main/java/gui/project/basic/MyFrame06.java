package gui.project.basic;

import javax.swing.*;
import java.awt.*;

public class MyFrame06 extends JFrame{
    // private JPanel panel2;

    public MyFrame06(){
        setTitle("My Frame");
        setSize(400, 200);
        setLocation(700, 100);
        // setLayout(new FlowLayout());
        
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel label = new JLabel("회원 등록하기");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel label1 = new JLabel("이름");
        JLabel label2 = new JLabel("패스워드");
        JLabel label3 = new JLabel("이메일주소");
        JLabel label4 = new JLabel("전화번호");
        // JLabel label5 = new JLabel();
        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);
        JTextField textField3 = new JTextField(15);
        JTextField textField4 = new JTextField(15);
        JButton button1 = new JButton("등록하기");
        JButton button2 = new JButton("취소");

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        
        panel2.add(textField1);
        panel2.add(textField2);
        panel2.add(textField3);
        panel2.add(textField4);
        
        panel3.add(button1);
        panel3.add(button2);
        
        panel.setLayout(new BorderLayout(10, 10));
        panel.add(label, "North" );
        panel.add(panel1, "West");
        panel.add(panel2, "East");
        panel.add(panel3, "South");
        
        add(panel);
        panel1.setLayout(new GridLayout(4, 1));
        panel2.setLayout(new GridLayout(4, 1));

        

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        new MyFrame06();
    }
}
