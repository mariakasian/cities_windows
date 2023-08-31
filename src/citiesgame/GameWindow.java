package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static citiesgame.GameLoop.gameLoop;

public class GameWindow implements ActionListener {

    static JFrame gameFrame;
    static  String input;
    static String lastComputerWord = null;


    //Створюємо компоненти.
    JLabel computerLabel = new JLabel("Комп’ютер:");
    JLabel userLabel = new JLabel("Гравець:");

    static JTextField userWordField = new JTextField(15);
    static JButton userStep = new JButton("Ваш хід");
    static  JLabel computerWordLabel = new JLabel("");
    static JLabel messageLabel = new JLabel("");

    GameWindow() {

        //Створюємо фрейм и задаємо розміри і положення компонентів.
        gameFrame = new JFrame("Міста!");
        gameFrame.setSize(516, 260);
        userLabel.setBounds(36, 30, 108, 30);
        userWordField.setBounds(170, 30, 225, 30);
        userStep.setBounds(395, 30, 80, 30);
        computerLabel.setBounds(36, 90, 108, 30);
        computerWordLabel.setBounds(170, 90, 284, 30);
        messageLabel.setBounds(36, 150, 428, 30);

        gameFrame.add(userLabel);
        gameFrame.add(userWordField);
        gameFrame.add(userStep);
        gameFrame.add(computerLabel);
        gameFrame.add(computerWordLabel);
        gameFrame.add(messageLabel);

        gameFrame.setLayout(null);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Змінюємо колір фону вікна на жовтий.
        gameFrame.setForeground(Color.BLUE);
        gameFrame.getContentPane().setBackground(Color.YELLOW);

        // Зміна розміру та шрифтів.
        Font font = new Font("Arial", Font.BOLD, 18);
        Font mFont = new Font("Arial", Font.PLAIN, 16);
        Font bFont = new Font("Arial", Font.BOLD, 12);
        userLabel.setFont(font);
        userWordField.setFont(font);
        userStep.setFont(bFont);
        computerLabel.setFont(font);
        computerWordLabel.setFont(font);
        messageLabel.setFont(mFont);

        // Змінюємо колір тексту для JLabel-ів та JButton.
        userLabel.setForeground(Color.BLUE);
        userWordField.setForeground(Color.BLACK);
        userStep.setBackground(Color.LIGHT_GRAY);
        userStep.setForeground(Color.BLACK);
        computerLabel.setForeground(Color.BLUE);
        computerWordLabel.setForeground(Color.BLACK);
        messageLabel.setForeground(Color.BLACK);

        userWordField.addActionListener(this);
        userStep.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        input = userWordField.getText();
        userStep.setBackground(Color.BLUE);
        userStep.setForeground(Color.YELLOW);
        gameLoop(input, lastComputerWord);
    }
}

