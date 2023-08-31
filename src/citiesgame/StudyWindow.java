package citiesgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import static citiesgame.FillCities.cities;

public class StudyWindow {

    String letters[] = {"А", "Б", "В", "Г", "Д", "Е", "Є", "Ж", "З", "І", "К", "Л", "М", "Н", "О", "П",
            "Р", "С", "Т", "У", "Ф", "Х", "Ч", "Ш", "Щ", "Ю", "Я"};

    StudyWindow() {

        //Создаём компоненты
        JLabel askForLetter = new JLabel("Введіть літеру алфавіта:");
        final JComboBox chooseLetter = new JComboBox(letters);
        JButton backButton = new JButton("Назад");
        final JList<String> citiesList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(citiesList);

        //Создаём фрейм и задаём размеры и раположение компонентов
        JFrame frame = new JFrame("Вивчаймо міста України!");
        frame.setSize(516,400);

        askForLetter.setBounds(40,30,280,30);
        chooseLetter.setBounds(366,30,100,30);
        backButton.setBounds(366,290,100,40);
        scrollPane.setBounds(40,80,280,250);

        frame.add(askForLetter);
        frame.add(chooseLetter);
        frame.add(backButton);
        frame.add(scrollPane);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Змінюємо колір фону вікна на жовтий
        frame.setForeground(Color.BLUE);
        frame.getContentPane().

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

        chooseLetter.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                String firstLetter = "" + chooseLetter.getItemAt(chooseLetter.getSelectedIndex());
                citiesList.setModel(suitableCities(firstLetter, cities));
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                frame.dispose(); //Закриваємо StudyWindow.
                GreatingWindow greatingWindow = new GreatingWindow(); //Відкриваємо вітальне вікно.
            }
        });
    }

    public static DefaultListModel<String> suitableCities(String firstLetter, HashSet<String> cities) {
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
