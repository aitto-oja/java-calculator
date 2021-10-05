import javax.swing.*;
import java.awt.*;

public class Calculator {
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    JButton[] numberButtons = new JButton[10];

    Font myFont = new Font("Serif", Font.BOLD, 33);

    // Constructor
    Calculator() {
        // Frame: 
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.getContentPane().setBackground(new java.awt.Color(61,44,141));
        frame.setLayout(null);

        // Textfield: 
        textfield = new JTextField();
        textfield.setBounds(40, 25, 340, 50);
        textfield.setFont(myFont);
        frame.add(textfield);

        // Number buttons: 
        for (int i=0; i<10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Panel: 
        panel = new JPanel();
        panel.setBounds(40, 100, 340, 340);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(new java.awt.Color(145, 107, 191));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);

        panel.add(numberButtons[0]);

        frame.add(panel);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}