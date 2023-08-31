package citiesgame;

import java.awt.*;

import static citiesgame.GameWindow.*;

public class ComputerWordToGameWindow {

    public static void computerWordToGameWindow(String lastComputerWord) {
        userWordField.setText(""); //Очищаємо поле для користувача.
        computerWordLabel.setText("" + lastComputerWord); // Відображаємо хід компьютера в вікні.
        userStep.setBackground(Color.LIGHT_GRAY);
        userStep.setForeground(Color.BLACK);
    }
}
