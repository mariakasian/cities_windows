package citiesgame;

import java.util.HashSet;

import static citiesgame.GameWindow.messageLabel;

public class IsCityInList {
    public static boolean isCityInList(String input) {

        HashSet<String> cities = FillCities.fillCities();
        boolean isCorrectCity = false;

        for (String city : cities) {
            if (city.equalsIgnoreCase(input)) {
                isCorrectCity = true;
                break;
            }
        }
        if (!isCorrectCity) {
            messageLabel.setText("Такого міста не існує в базі даних. Введіть інше місто!");
        }
        return isCorrectCity;
    }
}
