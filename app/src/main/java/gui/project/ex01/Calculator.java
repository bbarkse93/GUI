package gui.project.ex01;

import java.awt.*;
import javax.swing.*;


public class Calculator extends JFrame{

    
    private JPanel panel;
    private JTextField tfield;
    private JButton[] buttons;
    private String[] labels = {
            "backspace", "", "", "CE", "c",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "X", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=",
        };

    public Calculator(){
        tfield = new JTextField(35);
        panel = new JPanel();
        tfield.setText("0.");
        tfield.setEnabled(false);

        panel.setLayout(new GridLayout(0, 5, 3, 3));
        buttons = new JButton[25];
        int index = 0;
        for (int rows = 0; rows < 5; rows++) {
            for (int cols = 0; cols < 5; cols++){
                buttons[index] = new JButton(labels[index]);
                if( cols >= 3)
                buttons[index].setForeground(Color.red);
                else
                buttons[index].setForeground(Color.blue);
                panel.add(buttons[index]);
                index ++;
            }
        }
        add(tfield, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();    
    }
    
    public static void main(String[] args) {
        new Calculator();
        
    }
}
