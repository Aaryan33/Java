import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicGame extends JFrame {
    private JLabel label;
    private JButton button;

    public BasicGame() {
        setTitle("Basic Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Click the button!");
        button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        add(label);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BasicGame();
            }
        });
    }
}