package GUI;

import GameLogic.Turns;

import javax.swing.*;
import java.awt.*;

public class GUIGameFrame extends GUIGamePanel{
    GUIGamePanel GGP = new GUIGamePanel();
    JFrame jFrame = new JFrame();
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu("Settings");
    public JLabel jLabel = new JLabel();

    public GUIGameFrame() {

        jFrame.setVisible(true);
        jFrame.setSize(600,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());
        jFrame.setTitle("Tic-Tack-Toe");
        jFrame.add(GGP.jPanel);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(jLabel, BorderLayout.NORTH);

        jMenuBar.add(jMenu);
        jMenuBar.setBackground(Color.black);
        jMenuBar.setOpaque(true);

        jLabel.setFont(new Font("Snap", Font.BOLD, 64));
        jLabel.setBackground(Color.black);
        jLabel.setForeground(new Color(64,224,208));
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setOpaque(true);
        jLabel.setText("Tic-Tac-Toe");


    }
}
