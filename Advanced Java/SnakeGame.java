import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JFrame {
    private JLabel label;
    private JPanel panel;
    private int score = 0;
    private int x = 0;
    private int y = 0;
    private int dx = 0;
    private int dy = 0;
    private Timer timer;

    public SnakeGame() {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        label = new JLabel("Score: " + score);
        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        add(label, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                if (keyCode == KeyEvent.VK_LEFT) {
                    dx = -1;
                    dy = 0;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    dx = 1;
                    dy = 0;
                } else if (keyCode == KeyEvent.VK_UP) {
                    dx = 0;
                    dy = -1;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    dx = 0;
                    dy = 1;
                }
            }
        });

        setVisible(true);
        startGame();
    }

    private void startGame() {
        x = 0;
        y = 0;
        dx = 1;
        dy = 0;
        score = 0;
        label.setText("Score: " + score);

        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x += dx;
                y += dy;

                if (x < 0) {
                    x = panel.getWidth() - 1;
                } else if (x >= panel.getWidth()) {
                    x = 0;
                }

                if (y < 0) {
                    y = panel.getHeight() - 1;
                } else if (y >= panel.getHeight()) {
                    y = 0;
                }

                Graphics g = panel.getGraphics();
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, panel.getWidth(), panel.getHeight());
                g.setColor(Color.GREEN);
                g.fillRect(x, y, 10, 10);

                if (x == panel.getWidth() / 2 && y == panel.getHeight() / 2) {
                    score++;
                    label.setText("Score: " + score);
                }
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SnakeGame();
            }
        });
    }
}