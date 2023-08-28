package citiesgame;

public class IsUsersInvalidLastChar {
    public static char isUsersInvalidLastChar(String input) {
        char lastUserWordChar = Character.toLowerCase(input.charAt(input.length() - 1));
        if (lastUserWordChar == 'ь' || lastUserWordChar == 'и' || lastUserWordChar == 'й' || lastUserWordChar == 'ї') {
            String message = "Так як немає міста на літеру '" + lastUserWordChar + "', я введу місто на літеру 'і'.";
            lastUserWordChar = 'І';
        }

        return lastUserWordChar;
    }
}