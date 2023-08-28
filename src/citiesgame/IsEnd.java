package citiesgame;

public class IsEnd {

    public static void isEndFromUser(String input, int userScore, int computerScore) {
        GameWindow gameWindow = new GameWindow();

        if (input.equalsIgnoreCase("здаюсь")) {
            String whoLose = "Ви здалися.";
            String winner = "компьютер";
            gameWindow.frame.dispose(); // Закриття ігрового вікна
            FinalWindow finalWindow = new FinalWindow(); // Відкриття фінального вікна
        }
    }
    public static void isEndFromComputer(String lastComputerWord, int userScore, int computerScore) {
        GameWindow gameWindow = new GameWindow();

        if (lastComputerWord == null) {
            String whoLose = "Комп'ютер здався.";
            String winner = "гравець";
            gameWindow.frame.dispose(); // Закриття ігрового вікна
            FinalWindow finalWindow = new FinalWindow(); // Відкриття фінального вікна
        }
    }
}
