package citiesgame;

import java.util.HashSet;

import static citiesgame.GameLoop.gameLoop;
import static citiesgame.GameWindow.lastComputerWord;
import static citiesgame.GameWindow.messageLabel;

public class IsRepeated {
    public static void isRepeatedByUser(String input, HashSet<String> usedCities) {
        boolean isCityUsedByUser = usedCities.contains(input);
        if (isCityUsedByUser) {
            messageLabel.setText("Таке місто вже було. Введіть інше місто!");
            gameLoop(input, lastComputerWord);
        } else {
            usedCities.add(input);
        }
    }
}