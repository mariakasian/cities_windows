package citiesgame;

import static citiesgame.GameWindow.messageArea;

public class IsUsersInvalidLastChar {
    public static char isUsersInvalidLastChar(String input) {
        char lastUserWordChar = Character.toLowerCase(input.charAt(input.length() - 1));
        if (lastUserWordChar == 'ь' || lastUserWordChar == 'и' || lastUserWordChar == 'й' || lastUserWordChar == 'ї') {
            messageArea.setText("Так як немає міста на літеру '" + lastUserWordChar
                    + "', я ввів місто на літеру 'і'.");
            lastUserWordChar = 'І';
        }
        return lastUserWordChar;
    }
}