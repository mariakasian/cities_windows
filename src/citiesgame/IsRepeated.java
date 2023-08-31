package citiesgame;

import java.util.HashSet;

import static citiesgame.GameLoop.gameLoop;

import static citiesgame.GameWindow.messageArea;
import static citiesgame.IsEnd.lastComputerWord;

public class IsRepeated {
    public static HashSet<String> isRepeatedByUser(String input, HashSet<String> usedCities) {
        boolean isCityUsedByUser = usedCities.contains(input);
        if (isCityUsedByUser) {
            messageArea.setText("Таке місто вже було. Введіть інше місто!");
            gameLoop(input, lastComputerWord);
        } else {
            usedCities.add(input);
        }
        return usedCities;
    }
}