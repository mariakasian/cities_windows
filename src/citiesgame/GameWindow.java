package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow implements ActionListener {

    JFrame frame;
    String input;

    //Створюємо компоненти.
    JLabel computerLabel = new JLabel("Комп’ютер:");
    JLabel userLabel = new JLabel("Гравець:");
    JLabel computerWordLabel = new JLabel("");
    JTextField userWordField = new JTextField(15);
    JButton nextButton = new JButton("V");
    JLabel messageLabel = new JLabel("");

    GameWindow() {

        //Створюємо фрейм и задаємо розміри і положення компонентів.
        frame = new JFrame("Міста!");
        frame.setSize(516, 260);
        computerLabel.setBounds(36, 30, 108, 30);
        computerWordLabel.setBounds(180, 30, 284, 30);

        userLabel.setBounds(36, 90, 108, 30);
        userWordField.setBounds(180, 90, 244, 30);
        nextButton.setBounds(424, 90, 40, 30);
        messageLabel.setBounds(36, 150, 428, 30);

        frame.add(computerLabel);
        frame.add(userLabel);
        frame.add(computerWordLabel);
        frame.add(userWordField);
        frame.add(nextButton);
        frame.add(messageLabel);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Змінюємо колір фону вікна на жовтий.
        frame.setForeground(Color.BLUE);
        frame.getContentPane().setBackground(Color.YELLOW);

        // Зміна розміру та шрифтів.
        Font font = new Font("Arial", Font.BOLD, 18);
        Font bFont = new Font("Arial", Font.BOLD, 9);
        Font mFont = new Font("Arial", Font.PLAIN, 16);
        computerLabel.setFont(font);
        userLabel.setFont(font);
        computerWordLabel.setFont(font);
        userWordField.setFont(font);
        nextButton.setFont(bFont);
        messageLabel.setFont(mFont);

        // Змінюємо колір тексту для JLabel-ів та JButton.
        computerLabel.setForeground(Color.BLUE);
        userLabel.setForeground(Color.BLUE);
        computerWordLabel.setForeground(Color.BLACK);
        userWordField.setForeground(Color.BLACK);
        nextButton.setForeground(Color.YELLOW);
        nextButton.setBackground(Color.BLUE);
        messageLabel.setForeground(Color.BLACK);

        userWordField.addActionListener(this);
        nextButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        input = userWordField.getText();
    }
    GameLoop gameLoop = new GameLoop(input); //Передаємо input до GameLoop для подальшої обробки.

}

