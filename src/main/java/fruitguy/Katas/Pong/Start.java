//package fruitguy.Katas.Pong;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//
//public class Start extends JFrame implements KeyListener {
//    private JPanel board;
//    private int ballX, ballY, ballDX, ballDY, player1Y, player2Y;
//    private static final int BOARD_WIDTH = 600;
//    private static final int BOARD_HEIGHT = 400;
//    private static final int BALL_SIZE = 20;
//    private static final int PADDLE_WIDTH = 10;
//    private static final int PADDLE_HEIGHT = 80;
//    private static final int PADDLE_SPEED = 5;
//    private static final int BALL_SPEED = 5;
//    private static final int PLAYER1_X = 10;
//    private static final int PLAYER2_X = BOARD_WIDTH - PADDLE_WIDTH - 10;
//    private static final int PLAYER1_INITIAL_Y = (BOARD_HEIGHT - PADDLE_HEIGHT) / 2;
//    private static final int PLAYER2_INITIAL_Y = (BOARD_HEIGHT - PADDLE_HEIGHT) / 2;
//
//    public void Pong() {
//        // Set up the game window
//        setSize(BOARD_WIDTH, BOARD_HEIGHT);
//        setResizable(false);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Pong");
//        setLayout(new BorderLayout());
//
//        // Create the game board
//        board = new JPanel() {
//            public void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.setColor(Color.WHITE);
//                g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);
//                g.setColor(Color.BLACK);
//                g.fillRect(PLAYER1_X, player1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
//                g.fillRect(PLAYER2_X, player2Y, PADDLE_WIDTH, PADDLE_HEIGHT);
//                g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
//                g.setColor(Color.GRAY);
//                for (int i = 0; i < BOARD_HEIGHT; i += 20) {
//                    g.fillRect(BOARD_WIDTH / 2 - 2, i, 4, 10);
//                }
//            }
//        };
//        add(board, BorderLayout.CENTER);
//
//        // Set up game state
//        ballX = BOARD_WIDTH / 2 - BALL_SIZE / 2;
//        ballY = BOARD_HEIGHT / 2 - BALL_SIZE / 2;
//        ballDX = BALL_SPEED;
//        ballDY = BALL_SPEED;
//        player1Y = PLAYER1
//
//}
