package mainPack;

import javax.swing.*;

public class mainClass {
    public static void main(String[] args) {
        
        JFrame window = new JFrame(null, null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Kar sathe mishbo bhai");
        
        controlPanel gamePanel = new controlPanel();
        window.add(gamePanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
