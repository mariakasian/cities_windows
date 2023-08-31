package citiesgame;

import static citiesgame.GameLoop.gameLoop;
import static citiesgame.GameWindow.lastComputerWord;
import static citiesgame.GameWindow.messageArea;
import static citiesgame.IsComputerInvalidLastChar.isComputerInvalidLastChar;



public class IsCorrectFirstChar {
    public static void isCorrectFirstChar(String input) {

        char lastComputerWordChar = isComputerInvalidLastChar(lastComputerWord);

        if (Character.toLowerCase(input.charAt(0)) != Character.toLowerCase(lastComputerWordChar)) {
            messageArea.setText("Ви ввели місто з неправильної першої літери.");
            gameLoop(input, lastComputerWord);
        } else {
            messageArea.setText("");
        }
    }
}
