package com.coronavirus.view;

import javax.swing.*;
import java.awt.*;

public class HighScores extends JDialog {
    private static final String TITLE = "High Scores";

    public HighScores(JFrame parentFrame) {
        super(parentFrame, TITLE, ModalityType.DOCUMENT_MODAL);

        this.add(loadScores(), BorderLayout.CENTER);

        pack();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private JList loadScores() {

        // here we have to
        // 1. load data from file
        // 2. sort them
        // 3. think how to display them.
        // But for now, lets play with some sample

        String scores[]= {
                "1. Messi 230 days, dead: 100%, Level: Extremely Hard",
                "2. Ronaldo 130 days, dead: 100%, Level: Extremely Hard",
                "3. Lewy 100 days, dead: 100%, Level: High"
        };

        return new JList(scores);
    }
}
