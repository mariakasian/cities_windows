package citiesgame;

import java.util.List;

import static citiesgame.GameWindow.messageArea;
import static citiesgame.IsComputerInvalidLastChar.lastComputerWordChar;

public class IsRepeated {
    public static List<String> isRepeatedByUser(String input, List<String> usedCities) {
        if (usedCities.contains(input)) {
            messageArea.setText("Таке місто вже було. Введіть інше місто на літеру '" + lastComputerWordChar + "'!");
        } else {
            usedCities.add(input);
        }
        return usedCities;
    }
}