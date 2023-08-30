package citiesgame;

import java.util.HashSet;

import static citiesgame.GameWindow.messageLabel;

public class IsRepeated {
    public static boolean isRepeatedByUser(String input, HashSet<String> usedCities) {
        boolean isCityUsedByUser = usedCities.contains(input);
        if (isCityUsedByUser) {
            messageLabel.setText("Таке місто вже було. Введіть інше місто!");
        }
        usedCities.add(input);
        return isCityUsedByUser;
    }
}