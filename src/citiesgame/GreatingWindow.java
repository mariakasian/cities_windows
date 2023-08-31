package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

import static citiesgame.FillCities.fillCities;

public class GreatingWindow {
    JFrame greatingFrame;

    GreatingWindow() {

        //Створюємо компоненти.
        JLabel greatingLabel1 = new JLabel("Вітаємо вас у грі дитинства");
        JLabel greatingLabel2 = new JLabel("і всіх розумників!");
        JButton studyButton = new JButton("Навчатися");
        JButton playButton = new JButton("Грати");

        //Створюємо фрейм і задаємо розміри і положення компонентів.
        greatingFrame = new JFrame("Вітаємо!");
        greatingFrame.setSize(516, 200);
        greatingLabel1.setBounds(40, 40, 300, 30);
        greatingLabel2.setBounds(40, 82, 300, 30);
        studyButton.setBounds(320,30,140,36);
        playButton.setBounds(320,92,140,36);

        greatingFrame.add(greatingLabel1);
        greatingFrame.add(greatingLabel2);
        greatingFrame.add(studyButton);
        greatingFrame.add(playButton);

        greatingFrame.setLayout(null);
        greatingFrame.setVisible(true);
        greatingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        greatingFrame.setForeground(Color.BLUE);
        greatingFrame.getContentPane().setBackground(Color.YELLOW);
        studyButton.setBackground(Color.BLUE);
        studyButton.setForeground(Color.YELLOW);
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
        studyButton.setFont(buttonFont);
        playButton.setFont(buttonFont);

        studyButton.addActionListener(e -> {
            try {
                fillCities();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            greatingFrame.dispose(); // Закриття вітального вікна
            StudyWindow studyWindow = new StudyWindow(); // Відкриття ігрового вікна
        });

        playButton.addActionListener(e -> {
            try {
                fillCities();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            greatingFrame.dispose(); // Закриття вітального вікна
            GameWindow gameWindow = new GameWindow(); // Відкриття ігрового вікна
        });
    }

}


