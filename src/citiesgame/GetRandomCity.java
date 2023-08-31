package citiesgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class GetRandomCity {

    public static String getRandomCity(char firstChar, HashSet<String> cities, List<String> usedCities) {
        String lastComputerWord;
        List<String> properCities = new ArrayList<>();
        for (String city : cities) {
            if (Character.toLowerCase(city.charAt(0)) == Character.toLowerCase(firstChar)) {
                properCities.add(city);
            }
        }

        //Перевірка на повтор від комп'ютера.
        properCities.removeIf(usedCities::contains);

        if (properCities.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(properCities.size());
        lastComputerWord = properCities.get(index);
        return lastComputerWord;
    }
}
