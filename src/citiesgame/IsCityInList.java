package citiesgame;

import java.util.List;

public class IsCityInList {
    public static boolean isCityInList(String input) {

        List<String> cities = FillCities.fillCities();
        boolean isCorrectCity = false;

        for (String city : cities) {
            if (city.equalsIgnoreCase(input)) {
                isCorrectCity = true;
                break;
            }
        }
        if (!isCorrectCity) {
            System.out.println("Такого міста не існує в базі даних. Введіть інше місто!");
        }
        return isCorrectCity;
    }
}
