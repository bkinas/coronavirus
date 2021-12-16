package com.coronavirus.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class App {
    private static final String TITLE = "Gra Koronawirus AntiPlague";
    private JFrame frame;

    App() {
        create();
    }

    private JButton createNewGameButton() {
        JButton newGameButton = new JButton("New Game");
        newGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new RuntimeException("Not implemented yet");
            }
        });
        return newGameButton;
    }

    private JButton createHighScoresButton() {
        JButton highScoresButton = new JButton("High Scores");
        highScoresButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        highScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new RuntimeException("Not implemented yet");
            }
        });

        return highScoresButton;
    }

    private JButton createExitButton() {
        JButton exit = new JButton("Exit");
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        return exit;
    }

    void create() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(createMainMenu());
        frame.setBackground(Color.CYAN);
        frame.setLocationRelativeTo(null);

        setMenuIcon();

        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void setMenuIcon() {
        try {
            URL resource = getClass().getResource("virus.png");
            if (resource != null) {
                BufferedImage image = ImageIO.read(resource);
                frame.setIconImage(image);
            }
        } catch (IOException e) {
            System.out.println("Unable to load icon, reason: " + e.getMessage());
        }
    }

    private Component createMainMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(Box.createRigidArea(new Dimension(0, 80)));
        panel.add(createNewGameButton());
        panel.add(createHighScoresButton());
        panel.add(createExitButton());

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
