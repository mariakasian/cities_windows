package citiesgame;

public class IsCorrectFirstChar {
    public static boolean isCorrectFirstChar(String input, char lastComputerWordChar) {

        boolean isValid = false;

        if (Character.toLowerCase(input.charAt(0)) == Character.toLowerCase(lastComputerWordChar)) {
            isValid = true;
        } else {
            String message = "Ви ввели місто з неправильної першої літери.";
        }
        return isValid;
    }
}
