package gui.project.ex01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(300, 190); // JFrame의 크기
        setLocation(500, 300); // JFrame의 위치
        setTitle("MyFrame"); // JFrame의 이름
        setLayout(new FlowLayout()); // JFrame의 컴포넌트 배치 방식
        getContentPane().setBackground(Color.yellow); // Content Pane의 배경색
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");

        this.add(button1); // "확인"버튼 생성
        this.add(button2); // "취소"버튼 생성
        setVisible(true); // JFrame 보여주기
        setDefaultCloseOperation(EXIT_ON_CLOSE); // X눌러서 종료
    }

    public static void main(String[] args) {
        new MyFrame();

    }
}
