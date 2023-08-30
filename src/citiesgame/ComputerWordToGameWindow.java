package citiesgame;

import java.awt.event.ActionEvent;

import static citiesgame.GameWindow.*;

public class ComputerWordToGameWindow {

    public static void computerWordToGameWindow(String lastComputerWord) {
        input = null;
        userWordField.setText(""); //Очищаємо поле для користувача.
        computerWordField.setText("" + lastComputerWord); // Відображаємо хід компьютера в вікні.
    }
}
