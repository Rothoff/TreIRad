package GameLogic;

import GUI.GUIGameFrame;
import java.util.Random;

public class Turns {
    Random random = new Random();
    GUIGameFrame GGFrame = new GUIGameFrame();

    boolean player1sTurn;

    public Turns() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (random.nextInt(2) == 0) {
            player1sTurn = true;
            GGFrame.jLabel.setText("O Turn");
        }
        else {
            player1sTurn = false;
            GGFrame.jLabel.setText("X Turn");
        }
    }
}