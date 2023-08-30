package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static citiesgame.GameLoop.gameLoop;

public class GameWindow implements ActionListener {

    JFrame frame;
    static  String input;

    //Створюємо компоненти.
    JLabel computerLabel = new JLabel("Комп’ютер:");
    JLabel userLabel = new JLabel("Гравець:");
    static  JTextField computerWordField = new JTextField(15);
    static JTextField userWordField = new JTextField(15);
    static JLabel messageLabel = new JLabel("");

    GameWindow() {

        //Створюємо фрейм и задаємо розміри і положення компонентів.
        frame = new JFrame("Міста!");
        frame.setSize(516, 260);
        userLabel.setBounds(36, 30, 108, 30);
        userWordField.setBounds(180, 30, 284, 30);
        computerLabel.setBounds(36, 90, 108, 30);
        computerWordField.setBounds(180, 90, 284, 30);
        messageLabel.setBounds(36, 150, 428, 30);

        frame.add(computerLabel);
        frame.add(userLabel);
        frame.add(computerWordField);
        frame.add(userWordField);
        frame.add(messageLabel);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Змінюємо колір фону вікна на жовтий.
        frame.setForeground(Color.BLUE);
        frame.getContentPane().setBackground(Color.YELLOW);

        // Зміна розміру та шрифтів.
        Font font = new Font("Arial", Font.BOLD, 18);
        Font mFont = new Font("Arial", Font.PLAIN, 16);
        computerLabel.setFont(font);
        userLabel.setFont(font);
        computerWordField.setFont(font);
        userWordField.setFont(font);
        messageLabel.setFont(mFont);

        // Змінюємо колір тексту для JLabel-ів та JButton.
        computerLabel.setForeground(Color.BLUE);
        userLabel.setForeground(Color.BLUE);
        computerWordField.setForeground(Color.BLACK);
        userWordField.setForeground(Color.BLACK);
        messageLabel.setForeground(Color.BLACK);

        userWordField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        input = userWordField.getText();
        gameLoop(input);
    }
}

