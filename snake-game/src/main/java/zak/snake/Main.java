package zak.snake;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = boardWidth;
        int tileSize = 25;



        JFrame frame = new JFrame("Snake");

        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}