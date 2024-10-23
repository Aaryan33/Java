import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessNumberGame extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton tryButton;
    private JButton quitButton;
    private int randomNumber;

    public GuessNumberGame() {
        setTitle("Guess Number Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(new FlowLayout());

        label = new JLabel("Guess the number between 1 and 100:");
        textField = new JTextField(10);
        tryButton = new JButton("Try");
        quitButton = new JButton("Quit");

        tryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tryGuess();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(label);
        add(textField);
        add(tryButton);
        add(quitButton);

        setVisible(true);
        startGame();
    }

    private void startGame() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
    }

    private void tryGuess() {
        String guessText = textField.getText();

        try {
            int guess = Integer.parseInt(guessText);

            if (guess < 1 || guess > 100) {
                JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 100.");
            } else if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number.");
                System.exit(0);
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "The number is higher.");
            } else {
                JOptionPane.showMessageDialog(null, "The number is lower.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }

        textField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuessNumberGame();
            }
        });
    }
}
