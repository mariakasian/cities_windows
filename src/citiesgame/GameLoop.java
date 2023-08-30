package citiesgame;

import java.util.HashSet;
import java.util.Objects;


import static citiesgame.ComputerWordToGameWindow.computerWordToGameWindow;
import static citiesgame.IsEnd.isEndFromComputer;
import static citiesgame.IsEnd.isEndFromUser;
import static citiesgame.IsRepeated.isRepeatedByUser;

public class GameLoop {

    public static void gameLoop(String input) {
        HashSet<String> usedCities = new HashSet<>();
        String lastComputerWord = null;
        boolean isCorrectCity;
        boolean isValid;
        char lastUserWordChar;
        int userScore = 0;
        int computerScore = 0;

        while (true) {

            //isEnd від юзера.
            isEndFromUser(input, userScore, computerScore);

            //Перевіряємо, чи місто, що ввів користувач, є в списку міст.
            isCorrectCity = IsCityInList.isCityInList(input);
            if (!isCorrectCity) {
                continue;
            }

            //Перевіряємо, чи з потрібної букви ми вводимо слово.
            if (lastComputerWord != null) {
                isValid = IsCorrectFirstChar.isCorrectFirstChar(input, IsComputerInvalidLastChar.isComputerInvalidLastChar(lastComputerWord));
                if (!isValid) {
                    continue;
                }
            }

            //Перевірка на повтор від юзера.
            if (isRepeatedByUser(input, usedCities)) {
                continue;
            }

            //Ведемо рахунок балів юзера.
            userScore += input.length() * 5;

            //Перевірка, якщо місто, яке ввів гравець, закінчується на неіснуючу літеру.
            lastUserWordChar = IsUsersInvalidLastChar.isUsersInvalidLastChar(input);

            //Хід компьютера.
            lastComputerWord = GetRandomCity.getRandomCity(lastUserWordChar, usedCities);
            usedCities.add(lastComputerWord);

            //isEnd від комп'ютера.
            isEndFromComputer(lastComputerWord, userScore, computerScore);

            //Ведемо рахунок балів компьютера.
            computerScore += (lastComputerWord != null ? lastComputerWord.length() * 5 : 0);

            //Перевірка, якщо місто, яке ввів комп'ютер, закінчується на неіснуючу літеру.
            IsComputerInvalidLastChar.isComputerInvalidLastChar(Objects.requireNonNull(lastComputerWord));

            computerWordToGameWindow(lastComputerWord);
        }
    }
}