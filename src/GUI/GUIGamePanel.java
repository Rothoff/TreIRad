package GUI;

import javax.swing.*;
import java.awt.*;

public class GUIGamePanel{
    JPanel jPanel = new JPanel();
    JButton[] jButton = new JButton[9];

    GUIGamePanel(){
        jPanel.setLayout(new GridLayout(3,3));
        jPanel.setBackground(Color.black);

        for (int i = 0; i < jButton.length; i++) {
            jButton[i] = new JButton("" + i );
            jPanel.add(jButton[i]);
            jButton[i].setFocusable(false);
            jButton[i].setBorderPainted(true);
            jButton[i].setBorder(BorderFactory.createLineBorder(new Color(64,224,208)));
            jButton[i].setForeground(new Color(64,224,208));
            jButton[i].setBackground(Color.white);
            jButton[i].setFont(new Font("Times", Font.BOLD, 36));
            jButton[i].setOpaque(false);
        }


    }
}
