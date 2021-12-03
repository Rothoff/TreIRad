package GUI;

import GameLogic.Turns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGamePanel implements ActionListener {
    JPanel jPanel = new JPanel();
    JButton[] jButton = new JButton[9];

    public GUIGamePanel() {
        jPanel.setLayout(new GridLayout(3, 3));
        jPanel.setBackground(Color.black);

        for (int i = 0; i < jButton.length; i++) {
            jButton[i] = new JButton("");
            jPanel.add(jButton[i]);
            jButton[i].setFocusable(false);
            jButton[i].setBorderPainted(true);
            jButton[i].setBorder(BorderFactory.createLineBorder(new Color(64, 224, 208)));
            jButton[i].setForeground(new Color(64, 224, 208));;
            jButton[i].setFont(new Font("Times", Font.BOLD, 48));
            jButton[i].setOpaque(false);
            jButton[i].addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Turns tr = new Turns();
        GUIGameFrame GGFrame = new GUIGameFrame();
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == jButton[i]) {
                if (tr.player1sTurn) {
                    if (jButton[i].getText().equals("")) {
                        jButton[i].setForeground(Color.white);
                        jButton[i].setText("X");
                        tr.player1sTurn = true;
                        GGFrame.jLabel.setText("O Turn");
                    }
                }
                else {
                    if (jButton[i].getText().equals("")) {
                        jButton[i].setForeground(Color.white);
                        jButton[i].setText("O");
                        tr.player1sTurn = false;
                        GGFrame.jLabel.setText("X Turn");
                    }
                }
            }
        }
    }
}
