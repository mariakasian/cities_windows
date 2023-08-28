package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalWindow {
    JFrame frame;
    String whoLose;
    String winner;
    int userScore;
    int computerScore;
    FinalWindow() {

        //Создаём компоненты
        JLabel whoLoseLabel = new JLabel("" + whoLose);
        JLabel thanksLabel = new JLabel("Дякую за гру! Тепер ви краще знаєте міста України.");
        JLabel winnerLabel = new JLabel("Перемогу отримав: " + winner);
        JLabel scoreLabel = new JLabel("Рахунок:");
        JLabel userScoreLabel = new JLabel("гравець: " + userScore + " балів");
        JLabel computerScoreLabel = new JLabel("комп’ютер: " + computerScore + " балів");
        JButton endButton = new JButton("Завершити");

        //Создаём фрейм и задаём размеры и раположение компонентов
        frame = new JFrame("Вітаємо!");
        frame.setSize(516,260);
        whoLoseLabel.setBounds(36, 22, 440, 30);
        thanksLabel.setBounds(36, 56, 440, 30);
        winnerLabel.setBounds(36, 80, 440, 30);
        scoreLabel.setBounds(36, 120, 200, 30);
        userScoreLabel.setBounds(36, 146, 200, 30);
        computerScoreLabel.setBounds(36, 170, 200, 30);
        endButton.setBounds(330,142,140,48);

        frame.add(whoLoseLabel);
        frame.add(thanksLabel);
        frame.add(winnerLabel);
        frame.add(scoreLabel);
        frame.add(userScoreLabel);
        frame.add(computerScoreLabel);
        frame.add(endButton);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setForeground(Color.BLUE);
        frame.getContentPane().setBackground(Color.YELLOW);
        whoLoseLabel.setForeground(Color.BLACK);
        thanksLabel.setForeground(Color.BLUE);
        winnerLabel.setForeground(Color.BLUE);
        scoreLabel.setForeground(Color.BLUE);
        userScoreLabel.setForeground(Color.BLACK);
        computerScoreLabel.setForeground(Color.BLACK);
        endButton.setBackground(Color.BLUE);
        endButton.setForeground(Color.YELLOW);


        // Зміна розміру шрифта для Label-ів
        Font font = new Font("Arial", Font.BOLD, 17);
        whoLoseLabel.setFont(font);
        thanksLabel.setFont(font);
        winnerLabel.setFont(font);
        scoreLabel.setFont(font);
        userScoreLabel.setFont(font);
        computerScoreLabel.setFont(font);

        // Зміна розміру шрифта для startButton
        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        endButton.setFont(buttonFont);

        endButton.addActionListener(e -> {
            frame.dispose(); // Закриття фінального вікна
        });
    }
}
