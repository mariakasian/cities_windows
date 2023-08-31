package citiesgame;

import java.awt.event.ActionEvent;
import java.util.HashSet;

import static citiesgame.GameLoop.gameLoop;
import static citiesgame.GameWindow.lastComputerWord;
import static citiesgame.GameWindow.messageLabel;

public class IsCityInList {
    public static void isCityInList(String input) {

        HashSet<String> cities = FillCities.fillCities();
        boolean isCorrectCity = false;

        for (String city : cities) {
            if (city.equalsIgnoreCase(input)) {
                isCorrectCity = true;
                messageLabel.setText("");
                break;
            }
        }
        if (!isCorrectCity) {
            messageLabel.setText("Такого міста не існує в базі даних. Введіть інше місто!");
            gameLoop(input, lastComputerWord);
        }
    }
}
