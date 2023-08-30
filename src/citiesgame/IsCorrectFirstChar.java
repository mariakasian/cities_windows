package citiesgame;

import static citiesgame.GameWindow.messageLabel;

public class IsCorrectFirstChar {
    public static boolean isCorrectFirstChar(String input, char lastComputerWordChar) {

        boolean isValid = false;

        if (Character.toLowerCase(input.charAt(0)) == Character.toLowerCase(lastComputerWordChar)) {
            isValid = true;
        } else {
            messageLabel.setText("Ви ввели місто з неправильної першої літери.");
        }
        return isValid;
    }
}
