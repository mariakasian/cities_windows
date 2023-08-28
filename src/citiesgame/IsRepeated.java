package citiesgame;

import java.util.List;

public class IsRepeated {
    public static boolean isRepeatedByUser(String input, List<String> usedCities) {
        boolean isCityUsedByUser = usedCities.contains(input);
        if (isCityUsedByUser) {
            System.out.println("Таке місто вже було. Введіть інше місто!");
        }
        usedCities.add(input);
        return isCityUsedByUser;
    }
}