package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

import static citiesgame.GreatingWindow.cities;

public class StudyWindow {
    private static final int WINDOW_WIDTH = 516;
    private static final int WINDOW_HEIGHT = 400;

    private static final int ASK_FOR_LETTER_X = 40;
    private static final int ASK_FOR_LETTER_Y = 30;
    private static final int ASK_FOR_LETTER_WIDTH = 280;
    private static final int ASK_FOR_LETTER_HEIGHT = 30;

    private static final int CHOOSE_LETTER_X = 366;
    private static final int CHOOSE_LETTER_Y = 30;
    private static final int CHOOSE_LETTER_WIDTH = 100;
    private static final int CHOOSE_LETTER_HEIGHT = 30;

    private static final int BACK_BUTTON_X = 366;
    private static final int BACK_BUTTON_Y = 290;
    private static final int BACK_BUTTON_WIDTH = 100;
    private static final int BACK_BUTTON_HEIGHT = 40;

    private static final int SCROLL_PANE_X = 40;
    private static final int SCROLL_PANE_Y = 80;
    private static final int SCROLL_PANE_WIDTH = 280;
    private static final int SCROLL_PANE_HEIGHT = 250;

    String[] letters = {"А", "Б", "В", "Г", "Д", "Е", "Є", "Ж", "З", "І", "К", "Л", "М", "Н", "О", "П",
            "Р", "С", "Т", "У", "Ф", "Х", "Ч", "Ш", "Щ", "Ю", "Я"};

    StudyWindow() {

        //Создаём компоненты
        JLabel askForLetter = new JLabel("Оберіть літеру алфавіта:");
        final JComboBox chooseLetter = new JComboBox(letters);
        JButton backButton = new JButton("Назад");
        final JList<String> citiesList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(citiesList);

        //Создаём фрейм и задаём размеры и раположение компонентов
        JFrame studyFrame = new JFrame("Вивчаймо міста України!");
        studyFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        askForLetter.setBounds(ASK_FOR_LETTER_X,ASK_FOR_LETTER_Y,ASK_FOR_LETTER_WIDTH,ASK_FOR_LETTER_HEIGHT);
        chooseLetter.setBounds(CHOOSE_LETTER_X,CHOOSE_LETTER_Y,CHOOSE_LETTER_WIDTH,CHOOSE_LETTER_HEIGHT);
        backButton.setBounds(BACK_BUTTON_X,BACK_BUTTON_Y,BACK_BUTTON_WIDTH,BACK_BUTTON_HEIGHT);
        scrollPane.setBounds(SCROLL_PANE_X,SCROLL_PANE_Y,SCROLL_PANE_WIDTH,SCROLL_PANE_HEIGHT);

        studyFrame.add(askForLetter);
        studyFrame.add(chooseLetter);
        studyFrame.add(backButton);
        studyFrame.add(scrollPane);

        studyFrame.setLayout(null);
        studyFrame.setVisible(true);
        studyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Змінюємо колір фону вікна на жовтий
        studyFrame.setForeground(Color.BLUE);
        studyFrame.getContentPane().

        setBackground(Color.YELLOW);

        // Зміна розміру та шрифтів
        Font font = new Font("Arial", Font.BOLD, 18);
        Font listFont = new Font("Arial", Font.PLAIN, 16);
        askForLetter.setFont(font);
        chooseLetter.setFont(font);
        citiesList.setFont(listFont);
        backButton.setFont(font);

        // Змінюємо колір тексту для JLabel та JButton
        askForLetter.setForeground(Color.BLUE);
        chooseLetter.setForeground(Color.BLACK);
        citiesList.setForeground(Color.BLACK);
        backButton.setForeground(Color.YELLOW);
        backButton.setBackground(Color.BLUE);

        // Отримання розмірів екрану
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Розрахунок координат для вікна, щоб відкрити його посередині екрану
        int x = (screenWidth - WINDOW_WIDTH) / 2;
        int y = (screenHeight - WINDOW_HEIGHT) / 2;
        studyFrame.setLocation(x, y);

        chooseLetter.addActionListener(e -> {
            String firstLetter = "" + chooseLetter.getItemAt(chooseLetter.getSelectedIndex());
            citiesList.setModel(suitableCities(firstLetter, cities));
        });

        backButton.addActionListener(e -> {
            studyFrame.dispose(); //Закриваємо StudyWindow.
            new GreatingWindow(); //Відкриваємо вітальне вікно.
        });
    }

    private DefaultListModel<String> suitableCities(String firstLetter, HashSet<String> cities) {
        char letter = firstLetter.charAt(0);
        DefaultListModel<String> suitableCities = new DefaultListModel<>();

        for (String city : cities) {
            if (city.charAt(0) == letter) {
                suitableCities.addElement(city);
            }
        }
        return suitableCities;
    }
}
