package citiesgame;

import java.util.HashSet;

import static citiesgame.GameLoop.gameLoop;
import static citiesgame.GameWindow.lastComputerWord;
import static citiesgame.GameWindow.messageArea;


public class IsCityInList {
    public static void isCityInList(String input, HashSet<String> cities) {

        boolean isCorrectCity = false;

        for (String city : cities) {
            if (city.equalsIgnoreCase(input)) {
                isCorrectCity = true;
                messageArea.setText("");
                break;
            }
        }
        if (!isCorrectCity) {
            messageArea.setText("Такого міста не існує в базі даних. Введіть інше місто!");
            gameLoop(input, lastComputerWord);
        }
    }
}
