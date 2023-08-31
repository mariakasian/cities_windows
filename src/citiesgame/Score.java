package citiesgame;

public class Score {
    public static int userScore(String input, int userScore) {
        userScore += input.length() * 5;
        return userScore;
    }

    public static int computerScore(String lastComputerWord, int computerScore) {
        computerScore += (lastComputerWord != null ? lastComputerWord.length() * 5 : 0);
        return computerScore;
    }
}
