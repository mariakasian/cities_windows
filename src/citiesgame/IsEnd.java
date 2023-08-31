package citiesgame;

import static citiesgame.GameLoop.computerScore;
import static citiesgame.GameLoop.userScore;
import static citiesgame.GameWindow.gameFrame;

public class IsEnd {

    public static void isEndFromUser(String input, String lastComputerWord) {

        if (input.equalsIgnoreCase("здаюсь")) {
            gameFrame.dispose(); // Закриття ігрового вікна
            FinalWindow finalWindow = new FinalWindow(); // Відкриття фінального вікна
            finalWindow.whoLoseLabel.setText("Ви здалися.");
            finalWindow.winnerLabel.setText("Перемогу отримав: компьютер");
            finalWindow.userScoreLabel.setText("гравець: " + userScore + " балів");
            finalWindow.computerScoreLabel.setText("комп’ютер: " + computerScore + " балів");
        }
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
