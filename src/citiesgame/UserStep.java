package citiesgame;

import static citiesgame.ComputerStep.computerStep;
import static citiesgame.FillCities.cities;
import static citiesgame.GameWindow.usedCities;
import static citiesgame.IsCityInList.isCityInList;
import static citiesgame.IsRepeated.isRepeatedByUser;
import static citiesgame.Score.userScore;

public class UserStep {
    static int userScore = 0;

    public static void userStep(String input, String lastComputerWord) {

        //Перевіряємо, чи місто, що ввів користувач, є в списку міст.
        isCityInList(input, cities);

        //Перевіряємо, чи з потрібної букви ми вводимо слово.
        if (lastComputerWord != null) {
            IsCorrectFirstChar.isCorrectFirstChar(input);
        }
        //Перевірка на повтор від юзера.
        isRepeatedByUser(input, usedCities);

        //Ведемо рахунок балів юзера.
        userScore = userScore(input, userScore);

        //Перевірка, якщо місто, яке ввів гравець, закінчується на неіснуючу літеру.
        char lastUserWordChar = IsUsersInvalidLastChar.isUsersInvalidLastChar(input);

        computerStep(lastUserWordChar);
    }
}
