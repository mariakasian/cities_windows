package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static citiesgame.IsEnd.isEndFromUser;

public class GameWindow implements ActionListener {
    static JFrame gameFrame;
    static  String input;
    static List<String> usedCities = new ArrayList<>();
    static boolean isValid = true;

    //Створюємо компоненти.
    JLabel computerLabel = new JLabel("Комп’ютер:");
    JLabel userLabel = new JLabel("Гравець:");
    static JTextField userWordField = new JTextField(15);
    static JButton userStep = new JButton("Ваш хід");
    static  JLabel computerWordLabel = new JLabel("");
    JLabel attention = new JLabel("Повідомлення:");
    static JTextArea messageArea = new JTextArea("", 5, 20);
    JScrollPane scrollPane = new JScrollPane(messageArea);

    GameWindow() {

        //Створюємо фрейм и задаємо розміри і положення компонентів.
        gameFrame = new JFrame("Міста!");
        int windowWidth = 516;
        int windowHeight = 300;
        gameFrame.setSize(windowWidth, windowHeight);
        userLabel.setBounds(36, 30, 108, 30);
        userWordField.setBounds(170, 30, 225, 30);
        userStep.setBounds(395, 30, 80, 30);
        computerLabel.setBounds(36, 90, 108, 30);
        computerWordLabel.setBounds(170, 90, 284, 30);
        attention.setBounds(36, 140, 108, 30);
        scrollPane.setBounds(36, 170, 440, 60);

        gameFrame.add(userLabel);
        gameFrame.add(userWordField);
        gameFrame.add(userStep);
        gameFrame.add(computerLabel);
        gameFrame.add(computerWordLabel);
        gameFrame.add(attention);
        gameFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        gameFrame.setLayout(null);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageArea.setLineWrap(true);  // Встановлюємо автоматичний перенос рядків
        messageArea.setWrapStyleWord(true);  // Переносимо цілі слова, а не посередині слова

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
        attention.setFont(mFont);
        messageArea.setFont(mFont);

        // Змінюємо колір тексту для JLabel-ів та JButton.
        userLabel.setForeground(Color.BLUE);
        userWordField.setForeground(Color.BLACK);
        userStep.setBackground(Color.LIGHT_GRAY);
        userStep.setForeground(Color.BLACK);
        computerLabel.setForeground(Color.BLUE);
        computerWordLabel.setForeground(Color.BLACK);
        attention.setForeground(Color.BLUE);
        messageArea.setForeground(Color.BLACK);

        // Отримання розмірів екрану
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Розрахунок координат для вікна, щоб відкрити його посередині екрану
        int x = (screenWidth - windowWidth) / 2;
        int y = (screenHeight - windowHeight) / 2;
        gameFrame.setLocation(x, y);

        userWordField.addActionListener(this);
        userStep.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        input = userWordField.getText();
        userStep.setBackground(Color.BLUE);
        userStep.setForeground(Color.YELLOW);

        //Чи ввів юзер "здаюсь"?
        isEndFromUser(input);
    }
}

