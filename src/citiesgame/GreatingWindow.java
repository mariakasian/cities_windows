package citiesgame;

import javax.swing.*;
import java.awt.*;

public class GreatingWindow {
    JFrame frame;

    GreatingWindow() {

        //Створюємо компоненти.
        JLabel greatingLabel1 = new JLabel("Вітаємо вас у грі дитинства");
        JLabel greatingLabel2 = new JLabel("і всіх розумників!");
        JButton startButton = new JButton("Старт");

        //Створюємо фрейм і задаємо розміри і положення компонентів.
        frame = new JFrame("Вітаємо!");
        frame.setSize(516, 168);
        greatingLabel1.setBounds(48, 30, 300, 30);
        greatingLabel2.setBounds(48, 66, 300, 30);
        startButton.setBounds(360, 40, 90, 48);

        frame.add(greatingLabel1);
        frame.add(greatingLabel2);
        frame.add(startButton);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setForeground(Color.BLUE);
        frame.getContentPane().setBackground(Color.YELLOW);
        startButton.setBackground(Color.BLUE);
        startButton.setForeground(Color.YELLOW);
        greatingLabel1.setForeground(Color.BLUE);
        greatingLabel2.setForeground(Color.BLUE);

        // Зміна розміру шрифта для greatingLabel.
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        greatingLabel1.setFont(labelFont);
        greatingLabel2.setFont(labelFont);

        // Зміна розміру шрифта для startButton.
        Font buttonFont = new Font("Arial", Font.BOLD, 20);
        startButton.setFont(buttonFont);

        startButton.addActionListener(e -> {
                frame.dispose(); // Закриття вітального вікна
                GameWindow gameWindow = new GameWindow(); // Відкриття ігрового вікна
        });
    }
}


