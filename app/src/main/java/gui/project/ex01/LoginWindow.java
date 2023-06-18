package gui.project.ex01;
    import javax.swing.*;

public class LoginWindow extends JFrame{

    public LoginWindow(){
        setTitle("login window");
        setSize(300, 150);
        setLocation(700, 100);

        JPanel Panel = new JPanel();
        add(Panel);

        Panel.add(new JLabel("id     "));
        Panel.add(new JTextField(20));
        Panel.add(new JLabel("pass"));
        Panel.add(new JPasswordField(20));

        JButton login = new JButton("login");
        Panel.add(login);

        JButton cancel = new JButton("cancel");
        Panel.add(cancel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
     new LoginWindow();   
    }
}
