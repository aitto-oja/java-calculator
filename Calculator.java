import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JTextField warningText;

    Font myFont = new Font("Serif", Font.BOLD, 33);
    Font warningFont = new Font("Serif", Font.BOLD, 12);

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

        // Warning textfield:
        warningText = new JTextField();
        warningText.setBounds(40, 75, 340, 20);
        warningText.setFont(warningFont);
        warningText.setForeground(Color.red);
        warningText.setBackground(new java.awt.Color(61,44,141));
        frame.add(warningText);

        // Number buttons: 
        for (int i=0; i<10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Function Buttons:
        addButton = new JButton("+");
        functionButtons[0] = addButton;
        subButton = new JButton("-");
        functionButtons[1] = subButton;
        mulButton = new JButton("*");
        functionButtons[2] = mulButton;
        divButton = new JButton("/");
        functionButtons[3] = divButton;
        decButton = new JButton(".");
        functionButtons[4] = decButton;
        equButton = new JButton("=");
        functionButtons[5] = equButton;
        delButton = new JButton("Delete");
        functionButtons[6] = delButton;
        clrButton = new JButton("Clear");
        functionButtons[7] = clrButton;
        negButton = new JButton("(-)");
        functionButtons[8] = negButton;

        for (int i=0; i<9; i++) {
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        // Panel: 
        panel = new JPanel();
        panel.setBounds(40, 100, 340, 340);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(new java.awt.Color(145, 107, 191));
        
        // First row
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(functionButtons[0]);

        // Second row
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(functionButtons[1]);

        // Third row
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(functionButtons[2]);

        // Fourth row
        panel.add(functionButtons[4]);
        panel.add(numberButtons[0]);
        panel.add(functionButtons[5]);
        panel.add(functionButtons[3]);

        frame.add(panel);

        // Buttons under the panel: 
        negButton.setBounds(40, 450, 50, 50);
        delButton.setBounds(130, 450, 120, 50);
        clrButton.setBounds(260, 450, 120, 50);

        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}