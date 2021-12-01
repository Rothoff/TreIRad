package GUI;

import javax.swing.*;
import java.awt.*;

public class GUIGamePanel{
    JPanel jPanel = new JPanel();
    JButton[] jButton = new JButton[9];

    GUIGamePanel(){
        jPanel.setLayout(new GridLayout(3,3));
        jPanel.setBackground(Color.black);

        for (int i = 0; i < 9; i++) {
            jButton[i] = new JButton("" + i);
            jPanel.add(jButton[i]);
            jButton[i].setFocusable(false);
            jButton[i].setBorderPainted(false);
            jButton[i].setForeground(new Color(64,224,208));
            jButton[i].setBackground(Color.black);
            jButton[i].setFont(new Font("Times", Font.BOLD, 24));
            jButton[i].setOpaque(true);
        }


    }
}
