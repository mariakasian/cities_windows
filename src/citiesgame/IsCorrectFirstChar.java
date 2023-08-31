package citiesgame;

import static citiesgame.GameLoop.gameLoop;
import static citiesgame.GameWindow.lastComputerWord;
import static citiesgame.GameWindow.messageLabel;

public class IsCorrectFirstChar {
    public static void isCorrectFirstChar(String input, char lastComputerWordChar) {

        if (Character.toLowerCase(input.charAt(0)) != Character.toLowerCase(lastComputerWordChar)) {
            messageLabel.setText("Ви ввели місто з неправильної першої літери.");
            gameLoop(input, lastComputerWord);
        } else {
            messageLabel.setText("");
        }
    }
}
