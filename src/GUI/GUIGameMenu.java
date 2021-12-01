package GUI;

import javax.swing.*;
import java.awt.*;

public class GUIGameMenu {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Settings");
        JButton newGame = new JButton("New Game");

        JPanel jPanel = new JPanel();

        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(jPanel);

        jMenuBar.add(jMenu);

        jPanel.setVisible(true);
        jPanel.setPreferredSize(new Dimension(400,400));
        jPanel.setBackground(Color.black);
        jPanel.add(newGame);

        newGame.setVisible(true);
        newGame.setPreferredSize(new Dimension(100,50));
        newGame.setFont(new Font("Arial", Font.BOLD, SwingConstants.CENTER));


    }
}
