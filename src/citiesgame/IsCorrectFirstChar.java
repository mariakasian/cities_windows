package citiesgame;

import static citiesgame.GameWindow.isValid;
import static citiesgame.GameWindow.messageArea;
import static citiesgame.IsComputerInvalidLastChar.isComputerInvalidLastChar;
import static citiesgame.IsEnd.lastComputerWord;

public class IsCorrectFirstChar {
    public static void isCorrectFirstChar(String input) {

        char lastComputerWordChar = isComputerInvalidLastChar(lastComputerWord);

        if (Character.toLowerCase(input.charAt(0)) != Character.toLowerCase(lastComputerWordChar)) {
            isValid = false;
            messageArea.setText("Ви ввели місто з неправильної першої літери. Введіть ще раз місто на літеру '" + lastComputerWordChar + "'!");
        } else {
            messageArea.setText("");
        }
    }
}
