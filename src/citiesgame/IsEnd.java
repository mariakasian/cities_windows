package citiesgame;

import static citiesgame.ComputerStep.computerScore;
import static citiesgame.GameWindow.gameFrame;
import static citiesgame.UserStep.*;

public class IsEnd {
    static String lastComputerWord = null;

    public static void isEndFromUser(String input) {
        if (input.equalsIgnoreCase("здаюсь")) {
            gameFrame.dispose(); // Закриття ігрового вікна
            FinalWindow finalWindow = new FinalWindow(); // Відкриття фінального вікна
            finalWindow.whoLoseLabel.setText("Ви здалися.");
            finalWindow.winnerLabel.setText("Перемогу отримав: компьютер");
            finalWindow.userScoreLabel.setText("гравець: " + userScore + " балів");
            finalWindow.computerScoreLabel.setText("комп’ютер: " + computerScore + " балів");
        }
        userStep(input,lastComputerWord);
    }
    public static void isEndFromComputer(String lastComputerWord) {

        if (lastComputerWord == null) {
            gameFrame.dispose(); // Закриття ігрового вікна
            FinalWindow finalWindow = new FinalWindow(); // Відкриття фінального вікна
            finalWindow.whoLoseLabel.setText("Комп'ютер здався.");
            finalWindow.winnerLabel.setText("Перемогу отримав: гравець");
            finalWindow.userScoreLabel.setText("гравець: " + userScore + " балів");
            finalWindow.computerScoreLabel.setText("комп’ютер: " + computerScore + " балів");
        }
    }
}
