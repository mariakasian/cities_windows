package citiesgame;

import javax.swing.*;
import java.awt.*;

public class FinalWindow {
    JFrame finalFrame;
    JLabel whoLoseLabel;
    JLabel thanksLabel;
    JLabel winnerLabel;
    JLabel scoreLabel;
    JButton endButton;
    JLabel userScoreLabel;
    JLabel computerScoreLabel;

    FinalWindow() {

        //Створюємо компоненти.
        whoLoseLabel = new JLabel();
        thanksLabel = new JLabel("Дякую за гру! Тепер ви краще знаєте міста України.");
        winnerLabel = new JLabel();
        scoreLabel = new JLabel("Рахунок:");
        userScoreLabel = new JLabel();
        computerScoreLabel = new JLabel();
        endButton = new JButton("Завершити");

        //Створюємо фрейм и задаємо розміри і положенння компонентів.
        finalFrame = new JFrame("Вітаємо!");
        finalFrame.setSize(516,260);
        whoLoseLabel.setBounds(36, 22, 440, 30);
        thanksLabel.setBounds(36, 56, 440, 30);
        winnerLabel.setBounds(36, 80, 440, 30);
        scoreLabel.setBounds(36, 120, 200, 30);
        userScoreLabel.setBounds(36, 146, 200, 30);
        computerScoreLabel.setBounds(36, 170, 200, 30);
        endButton.setBounds(330,142,140,48);

        finalFrame.add(whoLoseLabel);
        finalFrame.add(thanksLabel);
        finalFrame.add(winnerLabel);
        finalFrame.add(scoreLabel);
        finalFrame.add(userScoreLabel);
        finalFrame.add(computerScoreLabel);
        finalFrame.add(endButton);

        finalFrame.setLayout(null);
        finalFrame.setVisible(true);
        finalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        finalFrame.setForeground(Color.BLUE);
        finalFrame.getContentPane().setBackground(Color.YELLOW);
        whoLoseLabel.setForeground(Color.BLACK);
        thanksLabel.setForeground(Color.BLUE);
        winnerLabel.setForeground(Color.BLUE);
        scoreLabel.setForeground(Color.BLUE);
        userScoreLabel.setForeground(Color.BLACK);
        computerScoreLabel.setForeground(Color.BLACK);
        endButton.setBackground(Color.BLUE);
        endButton.setForeground(Color.YELLOW);

        // Зміна розміру шрифта для Label-ів.
        Font font = new Font("Arial", Font.BOLD, 17);
        whoLoseLabel.setFont(font);
        thanksLabel.setFont(font);
        winnerLabel.setFont(font);
        scoreLabel.setFont(font);
        userScoreLabel.setFont(font);
        computerScoreLabel.setFont(font);

        // Зміна розміру шрифта для startButton.
        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        endButton.setFont(buttonFont);

        endButton.addActionListener(e -> {
            finalFrame.dispose(); // Закриття фінального вікна.
            System.exit(0);
        });
    }
}
