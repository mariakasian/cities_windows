package citiesgame;

import java.util.Objects;

import static citiesgame.ComputerWordToGameWindow.computerWordToGameWindow;
import static citiesgame.FillCities.cities;
import static citiesgame.GameWindow.usedCities;
import static citiesgame.IsEnd.isEndFromComputer;
import static citiesgame.Score.computerScore;

public class ComputerStep {
    static int computerScore = 0;
    public static String computerStep(char lastUserWordChar) {

        //Хід компьютера.
        String lastComputerWord = GetRandomCity.getRandomCity(lastUserWordChar, cities, usedCities);
        usedCities.add(lastComputerWord);

        computerWordToGameWindow(lastComputerWord);

        //isEnd від комп'ютера.
        isEndFromComputer(lastComputerWord);

        //Ведемо рахунок балів компьютера.
        computerScore = computerScore(lastComputerWord, computerScore);

        //Перевірка, якщо місто, яке ввів комп'ютер, закінчується на неіснуючу літеру.
        IsComputerInvalidLastChar.isComputerInvalidLastChar(Objects.requireNonNull(lastComputerWord));

        return lastComputerWord;
    }
}
