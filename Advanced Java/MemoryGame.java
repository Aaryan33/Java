import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MemoryGame extends JFrame {
    private JLabel label;
    private JButton[] buttons;
    private int[] values;
    private int firstIndex = -1;
    private int secondIndex = -1;
    private int score = 0;

    public MemoryGame() {
        setTitle("Memory Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Click the buttons to reveal the hidden values and match them!");
        buttons = new JButton[6];
        values = new int[6];

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton("?");
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int index = -1;

                    for (int i = 0; i < 6; i++) {
                        if (e.getSource() == buttons[i]) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1) {
                        buttons[index].setText(Integer.toString(values[index]));

                        if (firstIndex == -1) {
                            firstIndex = index;
                        } else {
                            secondIndex = index;

                            if (values[firstIndex] == values[secondIndex]) {
                                score++;
                                label.setText("Match found! Score: " + score);

                                if (score == 3) {
                                    label.setText("Congratulations! You won the game!");
                                    for (int i = 0; i < 6; i++) {
                                        buttons[i].setEnabled(false);
                                    }
                                }
                            } else {
                                label.setText("No match found. Try again!");
                                Timer timer = new Timer(1000, new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        buttons[firstIndex].setText("?");
                                        buttons[secondIndex].setText("?");
                                        firstIndex = -1;
                                        secondIndex = -1;
                                    }
                                });

                                timer.setRepeats(false);
                                timer.start();
                            }
                        }
                    }
                }
            });

            add(buttons[i]);
        }

        setVisible(true);
        startGame();
    }

    private void startGame() {
        int[] temp = {1, 1, 2, 2, 3, 3};

        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * temp.length);
            values[i] = temp[index];
            temp[index] = temp[temp.length - 1];
            temp = java.util.Arrays.copyOf(temp, temp.length - 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MemoryGame();
            }
        });
    }
}