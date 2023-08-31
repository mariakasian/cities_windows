package citiesgame;

import java.util.HashSet;
import java.util.Objects;

import static citiesgame.ComputerWordToGameWindow.computerWordToGameWindow;
import static citiesgame.FillCities.cities;
import static citiesgame.IsEnd.isEndFromComputer;
import static citiesgame.IsRepeated.isRepeatedByUser;
import static citiesgame.Score.computerScore;
import static citiesgame.Score.userScore;

public class GameLoop {
    static HashSet<String> usedCities = new HashSet<>();
    static int userScore = 0;
    static int computerScore = 0;

    public static String gameLoop(String input, String lastComputerWord) {
        char lastUserWordChar;

        //Чи ввів юзер "здаюсь"?
//        isEndFromUser(input);

        //Перевіряємо, чи місто, що ввів користувач, є в списку міст.
        IsCityInList.isCityInList(input, cities);

        //Перевіряємо, чи з потрібної букви ми вводимо слово.
        if (lastComputerWord != null) {
            IsCorrectFirstChar.isCorrectFirstChar(input);
        }

        //Перевірка на повтор від юзера.
        isRepeatedByUser(input, usedCities);

        //Ведемо рахунок балів юзера.
        userScore = userScore(input, userScore);

        //Перевірка, якщо місто, яке ввів гравець, закінчується на неіснуючу літеру.
        lastUserWordChar = IsUsersInvalidLastChar.isUsersInvalidLastChar(input);

        //Хід компьютера.
        lastComputerWord = GetRandomCity.getRandomCity(lastUserWordChar, cities, usedCities);
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