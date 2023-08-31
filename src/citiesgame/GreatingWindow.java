package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GreatingWindow {
    JFrame greatingFrame;

    GreatingWindow() {

        //Створюємо компоненти.
        JLabel greatingLabel1 = new JLabel("Вітаємо вас у грі дитинства");
        JLabel greatingLabel2 = new JLabel("і всіх розумників!");
        JButton playButton = new JButton("Грати");

        //Створюємо фрейм і задаємо розміри і положення компонентів.
        greatingFrame = new JFrame("Вітаємо!");
        greatingFrame.setSize(516, 168);
        greatingLabel1.setBounds(48, 30, 300, 30);
        greatingLabel2.setBounds(48, 66, 300, 30);
        playButton.setBounds(360, 40, 90, 48);

        greatingFrame.add(greatingLabel1);
        greatingFrame.add(greatingLabel2);
        greatingFrame.add(playButton);

        greatingFrame.setLayout(null);
        greatingFrame.setVisible(true);
        greatingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        greatingFrame.setForeground(Color.BLUE);
        greatingFrame.getContentPane().setBackground(Color.YELLOW);
        playButton.setBackground(Color.BLUE);
        playButton.setForeground(Color.YELLOW);
        greatingLabel1.setForeground(Color.BLUE);
        greatingLabel2.setForeground(Color.BLUE);

        // Зміна розміру шрифта для greatingLabel.
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        greatingLabel1.setFont(labelFont);
        greatingLabel2.setFont(labelFont);

        // Зміна розміру шрифта для startButton.
        Font buttonFont = new Font("Arial", Font.BOLD, 20);
        playButton.setFont(buttonFont);

        playButton.addActionListener(e -> {
            greatingFrame.dispose(); // Закриття вітального вікна
            GameWindow gameWindow = new GameWindow(); // Відкриття ігрового вікна
        });
    }
}


