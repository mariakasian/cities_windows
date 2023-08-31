package citiesgame;

import java.util.HashSet;

import static citiesgame.GameWindow.messageArea;
import static citiesgame.IsComputerInvalidLastChar.lastComputerWordChar;
import static citiesgame.IsEnd.lastComputerWord;

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
            if (lastComputerWord != null)
                messageArea.setText("Такого міста не існує в базі даних. Введіть ще раз місто на лутеру '" + lastComputerWordChar + "'!");
            } else {
                messageArea.setText("Такого міста не існує в базі даних. Введіть інше місто!");
        }
    }
}
